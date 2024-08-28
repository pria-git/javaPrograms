public class Lab018 {

    public static void main(String[] args) {
        /*String s = "Hello World!";
        driver.switchTo().window(handleArray[2]);

        String sc = new string;
    }
}

sc.StringBuffer.*/

        String original = "Hello, World!";

        // Reverse the string using a for loop
        String reversed = reverseString(original);

        // Print the reversed string
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    // Method to reverse a string
    public static String reverseString(String input) {
        // Create a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Loop through the string from the end to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            // Append each character to the StringBuilder
            reversed.append(input.charAt(i));
        }

        // Convert the StringBuilder to a String and return
        return reversed.toString();
    }
}
