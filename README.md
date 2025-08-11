# Student Grade Calculator (Java Swing)

A simple Java Swing application that allows users to enter marks for five subjects, calculates the **total marks**, **average score**, and assigns a **grade** based on the average.

## Features
- **Graphical User Interface** built using Java Swing
- Input fields for five subjects
- Calculate button to display:
  - Total Marks
  - Average Marks
  - Grade (A+ to F)
- Input validation with error messages for invalid entries
- Clean and organized `GridLayout` for easy navigation

## Technologies Used
- **Java** (JDK 8 or later)
- **Swing** (built-in Java GUI library)
- **VS Code** with Java Extension Pack

## Grade Calculation Logic
| Average Marks | Grade |
|--------------|-------|
| 90 and above | A+    |
| 80 - 89      | A     |
| 70 - 79      | B     |
| 60 - 69      | C     |
| 50 - 59      | D     |
| Below 50     | F     |

## How to Run
1. **Clone or Download** this project.
2. Open the folder in **VS Code**.
3. Make sure you have:
   - Java JDK installed
   - Java Extension Pack in VS Code
4. Compile the Java file:
   ```bash
   javac StudentGradeCalculator.java
