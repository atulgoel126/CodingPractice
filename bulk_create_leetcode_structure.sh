#!/bin/bash

# Ensure jq is installed
if ! command -v jq &> /dev/null
then
    echo "jq could not be found, installing..."
    if [[ "$OSTYPE" == "linux-gnu"* ]]; then
        sudo apt-get install -y jq
    elif [[ "$OSTYPE" == "darwin"* ]]; then
        brew install jq
    else
        echo "Unsupported OS type. Please install jq manually."
        exit 1
    fi
fi

# Ensure the create_leetcode_structure.sh script is executable
chmod +x create_leetcode_structure.sh

# Read questions from JSON file
questions=$(jq -c '.[]' questions.json)

# Loop through each question and run the create_leetcode_structure.sh script
echo "$questions" | while IFS= read -r question; do
  question_number=$(echo "$question" | jq -r '.number')
  question_title=$(echo "$question" | jq -r '.title')
  question_topic=$(echo "$question" | jq -r '.topic')

  if [[ -z "$question_number" || -z "$question_title" || -z "$question_topic" ]]; then
    echo "Error parsing question: $question"
    continue
  fi

  # Run the create_leetcode_structure.sh script with the question number, title, and topic
  ./create_leetcode_structure.sh "$question_number" "$question_title" "$question_topic"
done
