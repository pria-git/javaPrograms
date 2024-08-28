import org.apache.poi.ss.formula.atp.Switch;

import java.util.Scanner;

public class Lab017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser run the program");
        String brows_name = sc.nextLine();
        brows_name = brows_name.toLowerCase();

        switch (brows_name){
            case "chrome":
                System.out.println("chrome browser");
                break;
            case "firefox":
                System.out.println("firefox");
                break;
            case "edge":
                System.out.println("edge");
                break;

        }



    }
}
