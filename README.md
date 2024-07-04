# Coding Practice

This is a personal project to practice coding and writing tests. The provided shell script helps create a structured layout for solving coding problems and writing corresponding unit tests.

## Script Overview

The shell script (`create_leetcode_structure.sh`) is used to create a directory structure for coding problems and their tests. It ensures that each problem has its own directory with a Java file for the solution and a corresponding test file.

## Usage

To use the script, run it with the required arguments:

```sh
./create_leetcode_structure.sh <question number> <QuestionTitle>
```

### Example

```sh
./create_structure.sh 1 TwoSum
```
This command will:

1. Create the necessary directories for the problem and test.
2. Generate a Java file for the problem (TwoSum.java) in the appropriate directory.
3. Generate a corresponding test file (TwoSumTests.java).
4. Create a README.md file in the problem's directory.


## Project Structure

The project follows a specific directory structure to organize the problems and their tests. 
Here is an example of the structure after running the script:

```css
.
├── src
│   ├── main
│   │   └── java
│   │       └── leetcode
│   │           └── q1
│   │               ├── TwoSum.java
│   │               └── README.md
│   └── test
│       └── java
            └── leetcode
│               └── q1
│                   └── TwoSumTests.java
└── create_structure.sh
```

### Generated Files

* **src/main/java/leetcode/q1/TwoSum.java**: Java file containing the solution for the problem.
* **src/test/java/q1/TwoSumTests.java**: Java file containing the unit tests for the problem.
* **src/main/java/leetcode/q1/README.md**: README file specific to the problem, to provide additional details or documentation.


### Additional Notes

- Ensure that the script (`create_leetcode_structure.sh`) is executable. You can make it executable by running:
  ```sh
  chmod +x create_leetcode_structure.sh
