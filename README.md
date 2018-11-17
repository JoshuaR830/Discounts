Running my program:
I used Java 8 to create this project
I have also used JUnit 4 for testing

All of the source code is available in this repository



My approach to the problem
- I started off creating empty methods with no code
- I then created JUnit test cases that would ensure that my code output the correct things
- The unit tests guided my development, I gradually implemented the methods 
- Running the tests highlighted a few issues which were easy enough fixed
- I realised that the JUnit tests repeated quite a lot of code so created a class that the test files could inherit from
- I realised that I could have a class that has the pricing rules in them so I did that
- This class can then be passed into the constructor for the program allowing the offers to be changed without changing the main program
- I realised that I could simplify the program by having just one method to calculate A, B, C, D & E so refactored the program
- I then realised that I could split the main routine into methods too
- On splitting up main I realised that test also repeated some of this so I created a new class that the test class and discount class could both extend to minimise duplication
