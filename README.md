# TWU
Introductory Exercises for TWU

RUN: asterisk.java  
TO: Print one asterisk to the console.  

******************

RUN: asteriskline.java  
DEPENDENCIES: Linebuilder  
TO: Draw a horizontal line. Given a number n, print n asterisks on one line.  
Example when n=8:  
&ast;&ast;&ast;&ast;&ast;&ast;&ast;&ast;

*********************

RUN: AsteriskColumn.java  
DEPENDENCIES: Columnbuilder  
TO: Draw a vertical line. Given a number n, print n lines, each with one asterisks  
Example when n=3:  
&ast;  
&ast;  
&ast;  

******************

RUN: RightTriangle.java   
DEPENDENCIES: RtriangleBuilder  
TO: Draw a right triangle. Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)  
Example when n=3:  
&ast;  
&ast;&ast;  
&ast;&ast;&ast;  
 

*************

RUN: IsoTriangle.java  
DEPENDENCIES: ItriangBuilder  
TO: Draw Isosceles Triangle. Given a number n, print a centered triangle. Example for n=3:  
&nbsp; &nbsp; &ast;  
&nbsp; &ast;&ast;&ast;  
&ast;&ast;&ast;&ast;&ast;   

*************************

RUN: Diamond.java  
DEPENDENCIES: DiamondBuilder  
TO: Build Diamond. Given a number n, print a centered diamond. Example for n=3:  

&nbsp; &nbsp; &ast;  
&nbsp; &ast; &ast; &ast;  
&ast; &ast; &ast; &ast; &ast;  
&nbsp; &ast; &ast; &ast;  
&nbsp; &nbsp; &ast;  


********************

RUN: DiamondName.java  
DEPENDENCIES: NdiamondBuilder  
TO: Build Diamond with Name. Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:  
&nbsp; &nbsp; &ast;  
&nbsp; &ast; &ast; &ast;  
Paula  
&nbsp; &ast; &ast; &ast;  
&nbsp; &nbsp; &ast;  

*******************

RUN FizzBuzz.java  
DEPENDENCIES: Fizzer.java, Checker.java  
TO: Fizz Buzz  
FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to certain rules.  

Create a FizzBuzz() method that prints out the numbers 1 through 100.  
Instead of numbers divisible by three print "Fizz".  
Instead of numbers divisible by five print "Buzz".  
Instead of numbers divisible by three and five print "FizzBuzz".  

Sample Output:  
1  
2  
Fizz  
4  
Buzz  
Fizz  
7  
8  
Fizz  
Buzz  
11  
Fizz  
13  
14  
FizzBuzz  

******************

RUN: PrimeFactors.java  
DEPENDENCIES: Factors  
TO: Find prime factors  
Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.  

For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.
