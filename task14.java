import java.util.Scanner;

public class task14 {

    public static int countMatchingSubstrings(String first, String second) {
        int count = 0;

        int minLength = Math.min(first.length(), second.length());

        for (int start = 0; start < minLength; start++) {
            StringBuilder currentMatch = new StringBuilder();

            for (int offset = 0; start + offset < minLength; offset++) {
                char charFirst = first.charAt(start + offset);
                char charSecond = second.charAt(start + offset);

                if (charFirst == charSecond) {
                    currentMatch.append(charFirst);
                } else {
                    break;
                }
            }

            if (currentMatch.length() > 0) {
                System.out.println("Match found: " + currentMatch);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String stringOne = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String stringTwo = scanner.nextLine();

        int totalMatches = countMatchingSubstrings(stringOne, stringTwo);
        System.out.println("Total matching substrings: " + totalMatches);

        scanner.close();
    }
}