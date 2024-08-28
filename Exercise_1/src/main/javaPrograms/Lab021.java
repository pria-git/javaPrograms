import java.util.Scanner;

public class Lab021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter which operations do you want to perform + ,- , /, *");

        char operation = sc.next().charAt(0);
        // int a =0; int b = 0;
         int result;
        System.out.println("");

         switch (operation){
             case '+':
                int result1 =a +b;
                 System.out.println("Sum is" + result1);
                 break;

             case '-':
                 int result2 =a - b;
                 System.out.println("Sum is" + result2);
                 break;

             case '*':
                 int result3 =a *b;
                 System.out.println("Sum is" + result3);
                 break;
             case '/':
                 int result4 =a /b;
                 System.out.println("Sum is:" + result4);
                 break;
             default:
                 System.out.println("wrong input");
                 sc.close();

         }


    }
}
