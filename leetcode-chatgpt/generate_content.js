require('dotenv').config();
const fs = require('fs');
const path = require('path');

const OpenAI = require('openai')
const CHATGPT_API_KEY = process.env.CHATGPT_API_KEY;

if (!CHATGPT_API_KEY) {
    console.error("Please set the CHATGPT_API_KEY environment variable");
    process.exit(1);
}

const openai = new OpenAI({
    apiKey: process.env.OPENAI_API_KEY,
});

// Read questions from JSON file
const questions = JSON.parse(fs.readFileSync(path.join(__dirname, '../questions.json')));

async function fetchChatGPTResponse(prompt) {
    const response = await openai.completions.create({
        model: "gpt-3.5-turbo-instruct",
        prompt: prompt,
        temperature: 1,
        max_tokens: 3500,
        top_p: 1,
        frequency_penalty: 0,
        presence_penalty: 0,
    });

    console.log(JSON.stringify(response, null, 2));

    return response.choices[0].text.trim();
}
async function generateFiles() {
    for (const question of questions) {
        const { number, title, topic } = question;
        const cleanedTitle = title.replace(/[^a-zA-Z0-9]/g, '');
        const readmePrompt = `Write the complete question description for "${title}" as it appears on Leetcode or the internet. Format the response in a README.md file format with correct formatting.`;

        const leetcodeDir = path.join(__dirname, `../src/main/java/leetcode/${topic}/q${number}`);
        const testsDir = path.join(__dirname, `../src/test/java/leetcode/${topic}/q${number}`);

        // Create directories if they don't exist
        fs.mkdirSync(leetcodeDir, { recursive: true });
        fs.mkdirSync(testsDir, { recursive: true });

        // Create directories if they don't exist
        fs.mkdirSync(leetcodeDir, { recursive: true });
        fs.mkdirSync(testsDir, { recursive: true });

        // Check the length of the README file
        const readmeFilePath = path.join(leetcodeDir, 'README.md');
        let generateReadme = true;
        if (fs.existsSync(readmeFilePath)) {
            const readmeContent = fs.readFileSync(readmeFilePath, 'utf8');
            const readmeLines = readmeContent.split('\n').length;
            if (readmeLines > 5) {
                console.log(`README for question ${number} has more than 5 lines. Skipping generation.`);
                generateReadme = false;
            }
        }

        // Generate README if it doesn't already contain the question
        if (generateReadme) {
            try {
                const readmeContent = await fetchChatGPTResponse(readmePrompt);
                fs.writeFileSync(readmeFilePath, readmeContent);
                console.log(`Generated README.md for question ${number}`);
            } catch (error) {
                console.error(`Error generating README for question ${number}: ${error.message}`);
            }
        }

        const testFilePath = path.join(testsDir, `${cleanedTitle}Tests.java`);

        // Check the length of the test file
        let generateTests = true;
        if (fs.existsSync(testFilePath)) {
            const testContent = fs.readFileSync(testFilePath, 'utf8');
            const testLines = testContent.split('\n').length;
            if (testLines > 25) {
                console.log(`Test file for question ${number} has more than 25 lines. Skipping generation.`);
                generateTests = false;
            }
        }

        // Generate new test content using ChatGPT if the file is not too long
        if (generateTests) {
            let existingTestContent = '';
            if (fs.existsSync(testFilePath)) {
                existingTestContent = fs.readFileSync(testFilePath, 'utf8');
            } else {
                // Create a default test file content if it does not exist
                existingTestContent = `
package leetcode.${topic}.q${number};

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ${cleanedTitle}Tests {
    @Test
    public void testFoo() {
        ${cleanedTitle} ob = new ${cleanedTitle}();
        assertEquals(1 + 1, 2);
    }
}
                `;
            }

            // Generate new test content using ChatGPT with existing content as a prompt
            const testPrompt = `Here is the current test class for the Java class "${cleanedTitle}":\n\n${existingTestContent}\n\nBased on this template, add comprehensive test cases for the class. Include edge cases and potential issues.`;

            try {
                const newTestContent = await fetchChatGPTResponse(testPrompt);
                fs.writeFileSync(testFilePath, newTestContent);
                console.log(`Generated ${cleanedTitle}Tests.java for question ${number}`);
            } catch (error) {
                console.error(`Error generating test file for question ${number}: ${error.message}`);
            }
        }
    }
}


generateFiles().catch(err => {
    console.error("Error generating files:", err);
});
