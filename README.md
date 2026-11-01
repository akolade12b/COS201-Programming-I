# COS 201 — Computer Programming I

## Student Information

- **Name:** [Enter your full name]
- **Matriculation Number:** [Enter your matriculation number]
- **Programme:** Computer Science (CSC)
- **Course:** COS 201 — Computer Programming I
- **Weeks covered:** 1, 2 and 3

> Replace the two placeholders above with your real details before submitting.

---

## Week 1: Introduction to Programming and Problem-Solving

### Practical Exercise

Created, compiled and executed my first Java programme.

### Files

- `week01/FirstProgram.java` — displays the course details, programme, three reasons programming is important to Computer Science, and a personal learning goal.
- `docs/Week1-Assignments.md` — written answers for Activities A, B and C (IPO analysis, algorithms, pseudocode and flowcharts).

### Skills Practised

- Java class and `main` method
- Output statements
- Compilation and execution
- GitHub version control

---

## Week 2: Development Environment and First Java Program

### Practical Title

Development Environment and First Java Program

### Objective

To configure the Java development environment, write simple Java programs, compile them, execute them and submit the source code through GitHub.

### Tools Used

- Java Development Kit (JDK) 21
- Visual Studio Code (Java Extension Pack)
- Git
- GitHub Desktop
- GitHub

### Files

- `week02/HelloWorld.java` — the first Java program.
- `week02/StudentProfile.java` — personalised course information.
- `week02/PrintExample.java` — practice exercise comparing `print()` and `println()`.
- `week02/ErrorExample.java` — the corrected version of the missing-semicolon exercise.

### How to Run

1. Open a terminal in the `week02` directory.
2. Compile: `javac HelloWorld.java`
3. Run: `java HelloWorld`

The same pattern applies to the other files, for example `javac StudentProfile.java` then `java StudentProfile`.

### Learning Outcome

I practised creating, compiling and running Java programs and submitting source code through GitHub.

---

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialize Java variables.
- Use appropriate primitive and reference data types.
- Perform arithmetic calculations.
- Read keyboard input using `Scanner`.
- Display formatted output.
- Compile, test and submit Java programs using GitHub.

### Programs

1. `week03/SimpleCalculator.java` — performs arithmetic calculations on two numbers and handles a zero divisor.
2. `week03/AverageCalculator.java` — calculates the total and average of three scores. The extension exercise is completed: all scores are validated to be between 0 and 100.
3. `week03/ItemCost.java` — calculates the total cost using quantity and unit price.
4. `week03/CalculationError.java` — the corrected integer-division debugging exercise.

### How to Run

Open a terminal in the `week03` directory, then:

- Calculator: `javac SimpleCalculator.java` then `java SimpleCalculator`
- Average calculator: `javac AverageCalculator.java` then `java AverageCalculator`
- Item-cost program: `javac ItemCost.java` then `java ItemCost`
- Debugging exercise: `javac CalculationError.java` then `java CalculationError`

### Testing

| Program | Sample input | Expected output |
|---|---|---|
| SimpleCalculator | 20 and 4 | Sum 24.00, Difference 16.00, Product 80.00, Quotient 5.00 |
| SimpleCalculator (zero divisor) | 20 and 0 | Division is undefined for a zero divisor. |
| AverageCalculator | Amina Bello, 70, 80, 90 | Total 240.00, Average 80.00 |
| AverageCalculator (invalid) | Test, 120, 50, 60 | Invalid score: every score must be between 0 and 100. |
| ItemCost | Exercise Book, 3, 1500 | Total cost 4500.00 |
| CalculationError | none | 2.5 |

Every program was compiled with `javac` and executed with `java` before being committed.

### Notes

- Compiled `.class` files are excluded by `.gitignore`; only source code and documentation are submitted.
- Do not put passwords, access tokens or other confidential information in this repository.
