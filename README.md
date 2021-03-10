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
chapter 6- TryToPArseDoubleThe Double.parseDouble() method requires a String argument, but
 it fails if the String cannot be converted to a floating-point number.
 Write an application in which you try accepting a double input from
 a user and catch a NumberFormatException if one is thrown. The
 catch block forces the number to 0 and displays an appropriate error
 message. Following the catch block, display the number
