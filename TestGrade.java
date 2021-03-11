import java.util.Scanner;
public class TestGrade {
    public static int [] Student= {10,11,12,13,14,15,16,17};
    public static char [] Studentsgrade= new char[8];
    public static char g;
    public static void CheckGrade(char f) throws GradeException
    {
        g=f;
        int y;
        for (y=0;y<(GradeException.gradeletters.length);y++)
        {
          if (g==GradeException.gradeletters[y])
              break;}

          if (y==GradeException.gradeletters.length)
              throw new GradeException();

    }
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        String grade;

  for(int x = 0; x<=(Student.length)-1; x++)
  {
      try {
          System.out.println("Please enter a grade for student "+ Student[x]);
          grade=input.next();
          char g= grade.charAt(0);
          CheckGrade(g);
          Studentsgrade[x]=g;
      }
      catch (GradeException e) {
          System.out.println("The grade you entered is invalid");
          Studentsgrade[x]='I';

      }
  }
        System.out.println("The students and their scores are: ");
        for(int z=0;z<=(Student.length-1);z++)
        {
            System.out.println("The score for student " +Student[z]+ " is "+Studentsgrade[z]);
        }
    }
}
