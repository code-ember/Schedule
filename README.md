# scheduleBuilding
Building a schedule using switch statements

## INTRODUCTION
In this lab, you’ll create and access a schedule by using a *switch* statement. *Switch* statements provide a structured and efficient way to define, access, and manage schedules in code, promoting clarity, maintainability, and scalability.
Let’s use Toni as an example. He has a lot of work to catch up on and keeps forgetting what needs to be done, especially after coming back from his road trip. 

## THE GOAL 
To help Toni by creating a program that displays the schedule for the day when the day of the week is given in numeric form? For example, you could represent Monday as 1, Tuesday as 2, and so on.

## THE STARTER CODE

STEP 1: Import the Scanner at the very beginning of the file, before the start of the Main class, where it says.
- Once you’ve imported the Scanner, you’ll need to declare it.

STEP 2:  Create a Scanner variable. variable named "keyboard"
- Create the variable, capable of reading from the keyboard.

STEP 3: A variable named dayOfTheWeek has been declared. 
- Initialize this variable to 1, meaning we are setting it to Monday. 

STEP 4: Create the menu. 
- You want your program to display the options for the user.

STEP 5: Use the keyboard variable to read an integer into the variable dayOfTheWeek.
- Check if the user input is equal to any of the values from 1 to 7. Use the switch statement to help choose Toni’s schedule.

STEP 6: The switch and the 1st case is done for you. Implement the rest of the case statements. 
- If the values is not between 1 and 7 are handled by the default.

## PREVENTING FALL THROUGH
Run the program and input *dayOfTheWeek* as *1*, when prompted. You will observe that it executes *case 1* and then all the rest.

STEP 7: Include a break statement after the end of the code for every case statement to prevent fall through.  
- Use a break after each case, and ensure your default is the last case in your switch.

## MORE CHECKS AND MENUS
To make the program a bit more interactive, imagine Toni running off to work on Monday, but then often forgets to have breakfast on Monday, in which case a diversion is on the books. 

STEP 8: In order to get input as to whether Toni has had breakfast or not, you need to store the input.
- The creation of Scanner variable and declare variables "subChoice" at the start of the main method.

STEP 9: Create a menu to display inside case 1
- You have a sub-menu for Monday showed below.

*********** SUB MENU FOR MONDAY ******
1. Yes, I had my breakfast
2. No, I would like one
**************************************

STEP 10: Now prompt Toni for his choice and on this sub-menu, and get the input
- After the sub-menu inside case 1, prompt for input on choice from Toni and store it in the variable subChoice.

STEP 11: Now, why don’t you display the advice to Toni, based on his choice of the sub-menu for Monday. You can use an if-else chain for this.
- Display appropriate response to Toni, based on value in variable subChoice using if, if-else, else.

STEP 12: For case 2 (Tuesday), case 4 (Thursday), and case 7 (Sunday), use a nested switch statement, and if-else for the rest. These days have more than one possible outcome depending on another factor.
- For case 2 (Tuesday), Toni might have different tasks depending on the programming language he is using that day. This can be represented as a nested switch statement within the case for Tuesday, with different tasks for each programming language. 

STEP 13: For the remaining days (case 1, case 3, case 5, and case 6), the activities are straightforward.
- Do not depend on another variable, so a simple if-else statement is used.

Let's recap what you’ve done so far—you helped Toni to remember his schedule, based on the weekday Toni inputs. Then you refined the schedule to incorporate further queries to enable Toni to accomplish specialized tasks on the selected weekday, by using nested switch statements, nested if statements, and other constructs, which are allowed by Java.

## CONCLUSION
In this lab, you learned how to use a switch statement to create a menu and display the schedule for the day to the user. You explored how switch and case statements can be used for multiple equality checks. You also learned that a case statement can contain any code inside it, including other switch or if-else statements.

## Software Used: IntelliJ
