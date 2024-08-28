import java.util.Scanner;

public class Lab022 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number to check it is positive or negative");
        char num = sc.next().charAt(0);
        if(num == '-')
        System.out.println("number is negative");
    else {
            System.out.println("number is positive");
        }
    }
}
