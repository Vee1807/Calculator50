# Calculator50
Video Demo:  https://youtu.be/qrOe6HW8TTc

### Overview:

I made this program for my CS50 Final Project, it started with the simple idea of creating a decent working UI in Java which then evolved into a fully functional calculator!

The program is written in one file "Calculator50.java", I also made an icon for the program which is included in the project folder.

### Languages Used:
The program is fully written in JAVA using “Eclipse IDE” and the user interface is made using JFrame.

### Description:
Calculator50 is a calculator, more specifically a “Chain Calculator”. It works similarly to the windows calculator app in “Standard” mode. It does operations instantly regardless of the order of operations aka (PEMDAS).

### User Interface:
I chose a simple dark interface with purple as the primary color.
The background is dark grey while the buttons are a lighter shade of grey with purple text, except for the buttons on the top and the right side which are purple with white text. The equal button on the buttom right is a brighter shade of purple which helps the interface look less dull.

The user interface includes:
- A display screen that shows the current equation in purple at the top and the current answer at the buttom which is where you the numbers you type are displayed.
- Sine, cosine, tangent operators and a back button (the purple bar below the display screen).
- A clear button, addition, subtraction, multiplication, division operators
and an equal button (the purple bar on the right).
- Square, cube, square root and modulo operators.
- A numpad.

### Mathematical Functions and Specifications:
The functions included are:
- trigonometric functions (sine, cosine and tangent)
- Arithmetics (addition, subtraction, multiplication and division)
- Other functions (Square, cube, square root and modulo)

To use Square, cube, square root, modulo and the trigonometric functions, simply press the operator button after writing the number.

When using the trigonometric functions, make sure the angle you provide is measured in *degrees*.

If you try dividing by zero, you will get a message that says "You Can't Divide by Zero" and all the operator buttons will be frozen. You will be forced to either click the Clear button or any of the numbers and start a new operation.

### How Does It Work?
The calculator does operations on 2 numbers at a time - the current answer and the current number which can be either the number you write *or* the result of an "instant operation" which is described below. Every time you do an operation the current answer gets updated and displayed on the screen.

### Technicalities:
The square, cube, square root, modulo and the trigonometric functions - which I called "instant functions" are defined seperatly.
Unlike the other functions (addition, subtraction, multiplication and division) - these functions do operations on the number currently written in the display and *not* the current answer. The result is then considered the second number in the equation.

The default answer before any operation is *zero, and the default operation is **addition* - the first operation is always **0.0 + the number in the display**.

I made sure to include a flag that helps clear the old equations from the text field when they're not needed anymore.

### Possible Improvements:
- More theme options
- More operators
- Other Calculating modes
