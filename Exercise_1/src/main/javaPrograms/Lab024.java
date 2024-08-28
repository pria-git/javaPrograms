import java.util.Scanner;

public class Lab024 {

    public static void main(String[] args) {
        //Leap year program year should/ 4 and not divisible by 100 and should / 400
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if(year% 4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("Leap Year");

        }
else {
            System.out.println("not a leap year" );
        }
    }
}
