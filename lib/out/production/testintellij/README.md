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
   ** Chapter 7
   - Create a file using any word-processing program or text editor. Write
   an application that displays the file’s name, containing folder, size,
   and time of last modification. Save the file as FileStatistics.java.
   -2. Create three files of any type you choose—for example, word-processing
     documents, spreadsheets, or pictures. Write an application that determines
     whether the first two files are located in the same folder as
     the third one. Test the program when the files are in the same folder
     and when they are not. Save the file as CompareFolders.java.  
  3. Create a file that contains a line of your favorite song lyric. Use a text
       editor such as Notepad, and save the file. Copy the file contents, and
       paste them into a word-processing program such as Word. Write an
       application that displays the sizes of the two files as well as the ratio of
       their sizes to each other. Save the file as FileSizeComparison.java.
4. Write an application that determines which, if any, of the following files
   are stored in the folder where you have saved the exercises created in
   this chapter: autoexec.bat, CompareFolders.java, FileStatistics.class,
   and Hello.doc. Save the file as FindSelectedFiles.java.