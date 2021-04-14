import java.util.Scanner;

public class MorgansBonuses {
    enum Positivereviews {ZERO,ONE,TWO,THREE,FOUR,MORETHANFOUR};
    enum Weeksworked {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIXORMORE};

    public static void main (String[] args) {
        String UserEntry;
        Positivereviews positive;
        Weeksworked weeks;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter how much positive reviews u got: ZERO/ONE/TWO/THREE/FOUR/MORETHANFOUR");
        UserEntry= input.nextLine().toUpperCase();
        positive= Positivereviews.valueOf(UserEntry);
        System.out.println("Please enter how much weeks you worked: ZERO/ONE/TWO/THREE/FOUR/FIVE/SIXORMORE");
        UserEntry= input.nextLine().toUpperCase();
        weeks= Weeksworked.valueOf(UserEntry);
        Double [] [] pay = new Double [7] [5];
        System.out.println("Please enter "+pay.length+ " rows and " +pay[0].length+"columns");

        for(int row=0;row<pay.length;row++)
        {
            for (int column=0; column<pay[row].length;column++)
            {
                pay[row][column]=input.nextDouble();
            }
        }
      System.out.println(" You will be paid" + pay[weeks.ordinal()] [positive.ordinal()]);

    }
}
