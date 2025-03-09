# Schedule Management using Java Switch Statements

## Introduction
This project demonstrates how to create and access a schedule using a **switch** statement in Java. **Switch** statements provide a structured and efficient way to define, access, and manage schedules in code, promoting clarity, maintainability, and scalability.

### Meet Toni
To make it relatable, the example revolves around Toni, who has a lot of work to catch up on after returning from a road trip. The program helps Toni keep track of his schedule and avoid forgetting tasks.

## The Goal
The objective is to develop a program that displays the schedule for the day when the day of the week is provided in numeric form. For example:
- Monday = 1
- Tuesday = 2, and so on.

## Steps to Implement the Code

### The Starter Code
1. **Import the Scanner**
   - Add the Scanner import at the beginning of the file, before the `Main` class declaration.

2. **Create a Scanner Variable**
   - Declare a Scanner variable named `keyboard` to capture user input from the keyboard.

3. **Initialize Variables**
   - A variable named `dayOfTheWeek` is already declared. Initialize it to `1` (representing Monday).

4. **Create a Menu**
   - Display options for the user to select the day of the week.

5. **Capture User Input**
   - Use the `keyboard` variable to read an integer into `dayOfTheWeek`.
   - Use a **switch** statement to determine Toni’s schedule based on the day.

6. **Complete the Cases**
   - Add `case` statements for all days of the week.
   - Handle invalid inputs (e.g., numbers outside the range 1–7) in the `default` case.

### Preventing Fall Through
7. **Use Break Statements**
   - Add `break` after each case to prevent the program from executing subsequent cases unintentionally.

### More Checks and Menus
8. **Add Input for Sub-Choices**
   - Store additional input for more detailed options using a variable like `subChoice`.

9. **Create Sub-Menus**
   - For example, Toni’s schedule on Monday could include this sub-menu:
     ```
     *********** SUB MENU FOR MONDAY ******
     1. Yes, I had my breakfast
     2. No, I would like one
     **************************************
     ```

10. **Prompt for Sub-Menu Input**
    - Display the sub-menu and capture the user’s input in the `subChoice` variable.

11. **Handle Sub-Menu Choices**
    - Use an **if-else** statement to display appropriate messages for Toni based on the sub-menu choice.

### Advanced Functionality
12. **Use Nested Switch Statements**
    - For days like Tuesday, Thursday, or Sunday, include nested switches or additional logic for more complex schedules.

13. **Simplify Other Days**
    - For simpler schedules (e.g., Monday, Wednesday, Friday, Saturday), use straightforward **if-else** statements.

## Key Concepts Demonstrated
- **Switch Statements:** For handling multiple equality checks.
- **Break Statements:** To avoid unintended fall-through behavior.
- **Nested Logic:** Using **if-else** and nested **switch** statements for more interactive and dynamic schedules.

## Recap
You’ve created a program that helps Toni remember his schedule based on the day of the week. Additionally, you implemented further queries for specialized tasks on specific days. The program combines various Java constructs, such as nested **switch** statements and **if-else** chains, to improve functionality.

## Conclusion
This project highlights how **switch** statements can be used to create menus and interact with user input effectively. By using multiple constructs, you’ve enhanced clarity, maintainability, and interactivity in Toni’s schedule management program.

## Software Used
This project was developed using **IntelliJ IDEA**.

