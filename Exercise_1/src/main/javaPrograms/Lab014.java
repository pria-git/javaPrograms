import java.util.Scanner;

public class Lab014 {


    // print grade of student as per the input

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num >= 90 && num <=100){
            System.out.println("Grade A");

        } else if (num <= 79 && num>=60) {
            System.out.println("grade b");


        } else if (num>100 ) {
            System.out.println("invalid input please check");

        } else if (num<0) {
            System.out.println("inalid");

        } else {
            System.out.println("fail");
        }
    }
}
