import java.util.Scanner;
public class TestScore {
    public static final int [] StudentID={10,11,12,13,14};
    public static final int[] StudentScore= new int[5];

    public static int Score=0;

    public static void CheckScore(int f) throws ScoreException
    {
        Score=f;
        if (Score >100 || Score<0)
        {
            throw(new ScoreException());
        }
    }
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        for (int x=0;x<=(StudentID.length)-1;x++) {
            try {
                System.out.println("Please enter a numeric test score for student" + StudentID[x]);
                Score = input.nextInt();
                CheckScore(Score);
                StudentScore[x]=Score;

            } catch (ScoreException e) {
                System.out.println("The score was out of bounds and it is now reset to 0");
                StudentScore[x] = 0;
            }
        }
        System.out.println("The students and their scores are: ");
        for(int y=0;y<=(StudentID.length-1);y++)
        {
            System.out.println("The score for student " +StudentID[y]+ " is "+StudentScore[y]);
        }
    }

}
