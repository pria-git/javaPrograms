import java.util.Scanner;

public class Lab020 {

    public static void main(String[] args) {
        System.out.println(200 / 50 + (3 * 4));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x");
        double x = sc.nextDouble();
        System.out.println("enter value of y");
        double y = sc.nextDouble();
        System.out.println("enter value of z");
        double z = sc.nextDouble();

        double result ;
        result= Math.cbrt((Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println(result);
sc.close();


    }
}
