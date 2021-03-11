# OOP
 exercises for OOP
Chapter 3- Create an abstract class named Book. Include a String field for the
 book’s title and a double field for the book’s price. Within the class,
 include a constructor that requires the book title, and add two get
 methods—one that returns the title and one that returns the price. Include
 an abstract method named setPrice(). Create two child classes of
 Book: Fiction and NonFiction. Each must include a setPrice() method
 that sets the price for all Fiction Books to $24.99 and for all Non-
 Fiction Books to $37.99. Write a constructor for each subclass, and
 include a call to setPrice() within each. Write an application demonstrating
 that you can create both a Fiction and a NonFiction Book,
 and display their fields. Save the files as Book.java, Fiction.java,
 NonFiction.java, and UseBook.java.
**chapter 6- TryToPArseDoubleThe Double.parseDouble() method requires a String argument, but
 it fails if the String cannot be converted to a floating-point number.
 Write an application in which you try accepting a double input from
 a user and catch a NumberFormatException if one is thrown. The
 catch block forces the number to 0 and displays an appropriate error
 message. Following the catch block, display the number.
 -Write an application that displays a series of at least five student ID
 numbers (that you have stored in an array) and asks the user to enter
 a numeric test score for the student. Create a ScoreException class,
 and throw a ScoreException for the class if the user does not enter
 a valid score (less than or equal to 100). Catch the ScoreException,
 display an appropriate message, and then store a 0 for the student’s
 score. At the end of the application, display all the student IDs and
 scores. Save the files as ScoreException.java and TestScore.java.
 - Write an application that displays a series of at least eight student ID
 numbers (that you have stored in an array) and asks the user to enter
 a test letter grade for the student. Create an Exception class named
 GradeException that contains a static public array of valid grade letters
 (A, B, C, D, F, and I) that you can use to determine whether
 a grade entered from the application is valid. In your application,
 throw a GradeException if the user does not enter a valid letter grade.
 Catch the GradeException, and then display an appropriate message.
 In addition, store an I (for Incomplete) for any student for whom an
 exception is caught. At the end of the application, display all the
 student IDs and grades.Save the files as GradeException.java and
 TestGrade.java.
