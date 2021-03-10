import java.util.Scanner;
public class BadSubscriptCaught {
public static void main(String[] args) {

    String[] arr = {"David", "Marc", "Sandra", "Rita", "Anais", "Selma", "Garrett", "Flora"};
try {
   Scanner input= new Scanner(System.in);
   System.out.println("Please enter an integer");
   int num= input.nextInt();
   System.out.println("The name you requested is: "+arr[num]);
}
catch (ArrayIndexOutOfBoundsException e){
    System.out.println("The index you entered does not exist. Please try again.");
}
}
}
