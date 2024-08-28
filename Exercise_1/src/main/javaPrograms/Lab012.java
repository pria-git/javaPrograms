import java.util.Scanner;

public class Lab012 {

    public static void main(String[] args) {

        // Take the input from user
      /*  Scanner sc = new Scanner( System.in);
        System.out.println("Enter your number");
        //int num = sc.nextInt();
        float num = sc.nextFloat();
        if (num%2==0)
        System.out.println("even number");
        else
            System.out.println("odd number");

sc.close();*/

// take input from user and print the max number
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter first number");

        int num1 = sc1.nextInt();
        System.out.println("Enter second number");
        int num2= sc1.nextInt();
        if (num1 > num2 ) {
            System.out.println("num 1 is max number" + num1);
        }
            else{
            System.out.println("num 2 is max number" + num2);
            }
            sc1.close();
        }

    }

