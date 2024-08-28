import java.util.Scanner;

public class Lab013 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num < 9)
            System.out.println("number < 9");
        else if (num%2==0)
        {
            System.out.println("num is even ");

        }
        else {
            System.out.println("random number");
        }
    }
}
