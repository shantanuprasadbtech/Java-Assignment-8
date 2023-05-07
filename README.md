# Java-Assignment-8

This Java program calculates the factorial of an integer provided as a command-line argument. It includes error handling to check if the argument is a valid integer and within the range of 0 to 20, inclusive. If the provided number is negative or greater than 20, a custom exception, FactorialException, is thrown.

Classes:

Main: Contains the main() method and is responsible for iterating through the command-line arguments, parsing the integer argument, validating it, calculating the factorial, and printing the result.

FactorialException: A custom exception that is thrown if the integer argument is invalid, i.e., it is negative or greater than 20.

Validation: A class with a static method validateNum() that is used to validate the integer argument passed to the program.

Methods:

Main
Iterates through the command-line arguments, parses the integer argument, validates it, calculates the factorial, and prints the result.

FactorialException
FactorialException(String ErrMsg): The constructor for the FactorialException class. It takes an error message as a parameter and sets it as the exception message using the super() method.

Validation
validateNum(int num): A static method that is used to validate the integer argument passed to the program. It throws a FactorialException if the number is negative or greater than 20.
