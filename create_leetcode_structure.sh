#!/bin/bash

# Check if exactly two arguments are passed
if [ "$#" -ne 2 ]; then
  echo "Usage: $0 <question number> <QuestionTitle>"
  exit 1
fi

# Assign input parameters to variables
question_number=$1
question_title=$2

# Remove spaces and special characters from the question title
cleaned_title=$(echo "$question_title" | sed 's/[^a-zA-Z0-9]//g')

# Define the directory paths
leetcode_dir="src/main/java/leetcode/q${question_number}"
tests_dir="src/test/java/leetcode/q${question_number}"

# Define the file paths
leetcode_file="${leetcode_dir}/${cleaned_title}.java"
tests_file="${tests_dir}/${cleaned_title}Tests.java"
readme_file="${leetcode_dir}/README.md"

# Create the directories if they don't exist
mkdir -p "$leetcode_dir"
mkdir -p "$tests_dir"

# Create the main.java.leetcode file if it doesn't exist and add default content
if [ ! -f "$leetcode_file" ]; then
  echo "package leetcode.q${question_number};" > "$leetcode_file"
  echo "public class ${cleaned_title} {" >> "$leetcode_file"
  echo "}" >> "$leetcode_file"
fi

# Create the test file if it doesn't exist and add default content
if [ ! -f "$tests_file" ]; then
  echo "package q${question_number};" > "$tests_file"
  echo "" >> "$tests_file"
  echo "import static org.junit.jupiter.api.Assertions.*;" >> "$tests_file"
  echo "import org.junit.jupiter.api.Test;" >> "$tests_file"
  echo "import leetcode.q${question_number}.${cleaned_title};" >> "$tests_file"
  echo "" >> "$tests_file"
  echo "public class ${cleaned_title}Tests {" >> "$tests_file"
  echo "    @Test" >> "$tests_file"
  echo "    public void testFoo() {" >> "$tests_file"
  echo "        ${cleaned_title} ob = new ${cleaned_title}();" >> "$tests_file"
  echo "        assertEquals(1 + 1, 2);" >> "$tests_file"
  echo "    }" >> "$tests_file"
  echo "}" >> "$tests_file"
fi

# Create the README.md file if it doesn't exist
if [ ! -f "$readme_file" ]; then
  touch "$readme_file"
fi

# Print the created file paths
echo "Created: $leetcode_file"
echo "Created: $tests_file"
echo "Created: $readme_file"
