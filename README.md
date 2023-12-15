# Boolean Expression Constructor

## Overview

The Boolean Expression Constructor is a simple Java program that helps users construct a Boolean expression based on a truth table. Given the number of variables, it generates a truth table and allows the user to specify the true values for each row. The program then constructs a Boolean expression based on the rows where the result is true.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### How to Run

1. Clone this repository to your local machine.

   ```bash
   git clone https://github.com/your-username/BooleanExpressionConstructor.git
   ```

2. Navigate to the project directory.

   ```bash
   cd BooleanExpressionConstructor
   ```

3. Compile the Java code.

   ```bash
   javac Main.java
   ```

4. Run the program.

   ```bash
   java Main
   ```

## Usage

1. Enter the number of variables in your Boolean expression when prompted.

2. Provide true/false values for each row in the generated truth table.

3. The program will then construct a Boolean expression based on the rows where the result is true.

## Example

```bash
Enter number of variables in your boolean expression: 3
X1	X2	X3	Result
0	0	0	Enter the true value for this row (true/false): false
0	0	1	Enter the true value for this row (true/false): true
0	1	0	Enter the true value for this row (true/false): false
0	1	1	Enter the true value for this row (true/false): true
1	0	0	Enter the true value for this row (true/false): false
1	0	1	Enter the true value for this row (true/false): true
1	1	0	Enter the true value for this row (true/false): false
1	1	1	Enter the true value for this row (true/false): true
Boolean expression for true rows: (¬X1 AND ¬X2 AND X3) OR (¬X1 AND X2 AND X3) OR (X1 AND ¬X2 AND ¬X3) OR (X1 AND X2 AND X3)
```

## Contributing

If you'd like to contribute to this project, feel free to fork the repository and submit a pull request. We welcome contributions!

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Adjust the content as needed, and make sure to include a LICENSE file if you choose to use a specific license for your project.
