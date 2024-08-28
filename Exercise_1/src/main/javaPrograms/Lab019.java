import org.apache.poi.ss.formula.atp.Switch;

public class Lab019 {

    public static void main(String[] args) {

        //After Java 13 -> allwed that not require break
        //int item_code = 001;
        char ch = 'm';
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowels");
            default -> System.out.println("consonent");

        }
    }
}