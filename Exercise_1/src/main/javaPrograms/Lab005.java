import java.util.logging.SocketHandler;

public class Lab005 {
    public static void main(String[] args) {
        int a= 10;
        int b= 35;

        String name = "priya";
        System.out.println(a+b+name);

        int page= 30;
                int bage=34;
                        boolean result = bage > page;
        System.out.println(result);
        int ai = 10;
        int bi=10;
        boolean result1 = ai >= 10;
        System.out.println(result1);

        boolean result3 = (!(30>90));
        System.out.println(result3);

        System.out.println("Result for OR Gate");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Result for AND Gate");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);


        ///Increment and decrement
        int a1=10;
        int b1= ++a1; //preincrment 1st increment then print ++a => a = a+1;
        System.out.println(b1);

        // Now post increment = first value is used then increment
        System.out.println("output of below is");
        int c=10;
        int d= c++; //preincrment 1st increment then print c++ = 10;
        System.out.println(d);
        System.out.println(c);


    }
}
