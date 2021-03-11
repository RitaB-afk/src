public class GradeException extends Exception{
    public static char[] gradeletters={'A','B','C','D','F','I'};
    public GradeException() {
        super("the grade is not valid");
    }
}
