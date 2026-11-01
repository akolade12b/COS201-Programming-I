# COS 201 — Computer Programming I
## Week 1 Assignments (written answers)

- **Name:** Ajibola AKolade
- **Matriculation Number:** 25/16404
- **Programme:** Computer Science (CSC)

---

## Activity A — Identify the IPO components

### A1. Area of a rectangle with length 12 and width 5

- **Input:** length = 12, width = 5
- **Process:** area = length × width = 12 × 5
- **Output:** area = 60 square units

### A2. Average of four examination scores

- **Input:** four scores (s1, s2, s3, s4)
- **Process:** total = s1 + s2 + s3 + s4; average = total ÷ 4
- **Output:** the total and the average score

### A3. Determine whether a number is positive, negative or zero

- **Input:** a number, N
- **Process:** compare N with zero: if N > 0 it is positive; if N < 0 it is negative; otherwise it is zero
- **Output:** a message — "Positive", "Negative" or "Zero"

### A4. Total price of six items costing ₦250 each

- **Input:** quantity = 6, unit price = ₦250
- **Process:** total price = quantity × unit price = 6 × 250
- **Output:** total price = ₦1,500

### A5. Number of failed login attempts in a sample security log

- **Input:** the sample security log (records of login attempts)
- **Process:** examine each record; when an attempt is marked "failed", add 1 to a counter
- **Output:** the total count of failed login attempts

---

## Activity B — Write algorithms

### B1. Accept two numbers and display their sum

```
1. Start.
2. Read the first number, A.
3. Read the second number, B.
4. Calculate SUM = A + B.
5. Display SUM.
6. Stop.
```

- **Input:** A and B
- **Processing steps:** add A and B
- **Output:** SUM

### B2. Calculate the area of a circle using A = πr²

```
1. Start.
2. Read the radius, r.
3. Calculate AREA = π × r × r.
4. Display AREA.
5. Stop.
```

- **Input:** radius r
- **Processing steps:** square the radius, then multiply by π (use π = 3.142)
- **Output:** AREA

### B3. Accept a student's score and determine whether the student passed (pass mark 50)

```
1. Start.
2. Read score.
3. If score < 0 or score > 100, display "Invalid score" and go to step 7.
4. If score >= 50, display "Pass" and go to step 7.
5. Display "Fail".
6. (No further action.)
7. Stop.
```

- **Input:** score
- **Processing steps:** validate that the score is between 0 and 100, then compare it with the pass mark
- **Output:** "Invalid score", "Pass" or "Fail"

### B4. Accept three numbers and display the largest

```
1. Start.
2. Read three numbers: A, B and C.
3. Set LARGEST = A.
4. If B > LARGEST, set LARGEST = B.
5. If C > LARGEST, set LARGEST = C.
6. Display LARGEST.
7. Stop.
```

- **Input:** A, B and C
- **Processing steps:** assume the first number is the largest, then compare each remaining number and replace LARGEST whenever a bigger number is found
- **Output:** LARGEST

### B5. Calculate the total cost of items purchased, given quantity and unit price

```
1. Start.
2. Read quantity, Q.
3. Read unit price, P.
4. Calculate TOTAL = Q × P.
5. Display TOTAL.
6. Stop.
```

- **Input:** quantity Q and unit price P
- **Processing steps:** multiply the quantity by the unit price
- **Output:** TOTAL cost

---

## Activity C — Pseudocode and flowcharts

Two problems are selected from Activity B: **B3 (Pass or Fail)** and **B4 (Largest of three numbers)**.

### Chosen problem 1: Pass or Fail (B3)

**1. Algorithm in numbered steps**

1. Start.
2. Read score.
3. If score < 0 or score > 100, display "Invalid score" and stop.
4. If score ≥ 50, display "Pass" and stop.
5. Otherwise, display "Fail".
6. Stop.

**2. Pseudocode**

```
START
INPUT score
IF score < 0 OR score > 100 THEN
    OUTPUT "Invalid score"
ELSE IF score >= 50 THEN
    OUTPUT "Pass"
ELSE
    OUTPUT "Fail"
END IF
STOP
```

**3. Flowchart**

Symbols: oval = start/stop (terminator), parallelogram = input/output, diamond = decision, rectangle = process, arrows = flow of execution.

```
          +-----------+
          |   START   |
          +-----+-----+
                |
        +-------v--------+
        |  INPUT score   |
        +-------+--------+
                |
     +----------v-------------+
     | score < 0 OR score>100?|
     +----+-------------------+
         Yes                  No
          |                    |
  +-------v--------+    +------v-----------+
  | OUTPUT         |    |  score >= 50?    |
  | "Invalid score"|    +---+----------+---+
  +-------+--------+       Yes         No
          |                 |           |
          |          +------v----+  +---v-------+
          |          | OUTPUT    |  | OUTPUT    |
          |          | "Pass"    |  | "Fail"    |
          |          +------+----+  +-----+-----+
          |                 |             |
          +-----------------+-------------+
                            |
                      +-----v-----+
                      |   STOP    |
                      +-----------+
```

All three branches end at the same STOP.

### Chosen problem 2: Largest of three numbers (B4)

**1. Algorithm in numbered steps**

1. Start.
2. Read A, B and C.
3. Set LARGEST = A.
4. If B > LARGEST, set LARGEST = B.
5. If C > LARGEST, set LARGEST = C.
6. Display LARGEST.
7. Stop.

**2. Pseudocode**

```
START
INPUT A
INPUT B
INPUT C
LARGEST = A
IF B > LARGEST THEN
    LARGEST = B
END IF
IF C > LARGEST THEN
    LARGEST = C
END IF
OUTPUT LARGEST
STOP
```

**3. Flowchart**

Symbols: oval = start/stop, parallelogram = input/output, rectangle = process, diamond = decision.

```
            +-----------+
            |   START   |
            +-----+-----+
                  |
          +-------v--------+
          | INPUT A, B, C  |
          +-------+--------+
                  |
          +-------v--------+
          |  LARGEST = A   |
          +-------+--------+
                  |
          +-------v--------+
          |  B > LARGEST?  |
          +---+--------+---+
             Yes        No
              |          |
        +-----v-----+    |
        | LARGEST=B |    |
        +-----+-----+    |
              |          |
              +----+-----+
                   |
          +--------v-------+
          |  C > LARGEST?  |
          +---+--------+---+
             Yes        No
              |          |
        +-----v-----+    |
        | LARGEST=C |    |
        +-----+-----+    |
              |          |
              +----+-----+
                   |
          +--------v-------+
          | OUTPUT LARGEST |
          +--------+-------+
                   |
             +-----v-----+
             |   STOP    |
             +-----------+
```

When the answer to a decision is "No", no value changes; execution continues to the next comparison. This is why the LARGEST variable must be set to A before the comparisons begin.
