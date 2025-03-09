# Using Switch Statements
### Building a Schedule

## Introduction
In this lab, you'll create and access a schedule by using a **switch** statement. These statements provide a structured and efficient way to define, access, and manage schedules in code, promoting clarity, maintainability, and scalability.

Let’s take Toni as an example: he has a lot of work to catch up on and often forgets what needs to be done, especially after returning from his road trip.

## Goal
Help Toni by creating a program that displays the schedule for the day when the day of the week is provided in numeric form. For example:
- Monday = 1
- Tuesday = 2
- ...and so on.

## Steps to Follow
### Step 1: Import the Scanner
- Import the Scanner at the very beginning of the file, before the start of the Main class.

### Step 2: Create a Scanner Variable
- Declare a Scanner variable named `keyboard` to read input from the user.

### Step 3: Initialize Variables
- Declare and initialize `dayOfTheWeek` to `1` (representing Monday).

### Step 4: Create a Menu
- Display options for the user.

### Step 5: Capture User Input
- Use the `keyboard` variable to read an integer into `dayOfTheWeek`.

### Step 6: Add Case Statements
- Implement the case statements for days 2 through 7.
- Add a default case to handle invalid inputs.

### Step 7: Prevent Fall-Through
- Include a `break` statement at the end of each case block.

## Enhancing User Interaction
### Step 8: Add a Sub-Choice for Monday
- Add a submenu:
     ```java
     *********** SUB MENU FOR MONDAY ***********
     Yes, I had my breakfast
     No, I would like one

### Step 9: Prompt for Input
- Inside case 1, ask Toni for his sub-choice and store it in `subChoice`.

### Step 10: Display Responses
- Based on `subChoice`, display the appropriate advice to Toni using if-else logic.

### Step 11: Add Nested Structures for Specific Days
- Case 2 (Tuesday), Case 4 (Thursday), and Case 7 (Sunday): Use nested switches.
- Other days (Monday, Wednesday, Friday, Saturday): Use simple if-else structures.

## Conclusion
In this lab, you learned how to:
- Use switch statements to build menus.
- Handle multiple equality checks efficiently.
- Implement nested switch and if-else statements.

## Software Used
- IntelliJ IDEA

