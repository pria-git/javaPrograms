import org.openqa.selenium.io.Zip;

public class Lab011 {
    public static void main(String[] args) {

        String name = "Priya";
        String name1= "Priya";
        String s = new String("Priya");
        System.out.println(name == name1);
        System.out.println(name.equals(name1));

        System.out.println("below print the result");
        //Ternary operator
        int a =45;
        int b = 55;
        int max = a<b ? b : a ;
        int min = a>b ? b : a ;
        System.out.println(max);
        System.out.println(min);

        int x= 10;
        float y= 12.4f;
        float z= 56.78f;
        float max1 = (x > y) ? (x > z ? x : z) : (y > z ? y: z);
        float min1 = x<y ? y<z? x: y: z;
        System.out.println(max1);
        System.out.println(min1);

// USe match operator to solve this



    }
    }

