import java.util.Scanner;

public class task7 {

    public static String reverseText(String text) {
        StringBuilder reversedText = new StringBuilder();
        for (int index = text.length() - 1; index >= 0; index--) {
            reversedText.append(text.charAt(index));
        }
        return reversedText.toString();
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String userInput = inputScanner.nextLine();

        String reversed = reverseText(userInput);

        System.out.println("You entered: " + userInput);
        System.out.println("Reversed: " + reversed);

        inputScanner.close();
    }
}