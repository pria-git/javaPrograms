import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the alpha");
        char ui = sc.next().charAt(0);

        if (ui == 'a'|| ui== 'e' || ui=='i' || ui=='o'|| ui=='u'){
            System.out.println("Vowels");

        }
        else
            System.out.println("consonent");
    }

}
