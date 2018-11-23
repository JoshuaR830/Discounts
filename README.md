Running my program:
- Requires Java 8 (1.8.0_191)
- Requires JUnit 4 for running the tests
- To run the program (main) go to UnidaysDiscountChallenge.java and click run
- You will then be able to enter the items in your basket
- Press enter and the total price will be calculated

- The source code for the program is in: src/richardson/joshua/dicount/code
- The source code for the testing is in: src/richardson.joshua/dicount/code
- The JavaDocs can be found in src/documentation 

Issue you might face in IntelliJ
- I made this in IntelliJ and there was a nice little issue where it would not run the JUnit
So the fun fix if you face a similar issue is to go to project structure then in modules select dependencies and change the JUnit scope to be compile.
- File -> Project Structure -> Modules -> Dependencies -> Then next to JUnit4 under scope change it to compile then apply

Eclipse might be easier - just needs JUnit and Java 8 (1.8.0_191)



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
- I added JavaDocs which should make the code more understandable
