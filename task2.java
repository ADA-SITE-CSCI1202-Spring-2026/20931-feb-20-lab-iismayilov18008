import java.util.Scanner;
import java.util.Arrays;

public class task2 {

    public static int getMinimum(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
        }
        return min;
    }

    public static int getMaximum(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int[] getMinAndMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operation 1: Enter numbers separated by spaces:");
        String line = scanner.nextLine();
        String[] parts = line.trim().split("\\s+");
        int[] numbers1 = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers1[i] = Integer.parseInt(parts[i]);
        }

        System.out.println("Numbers entered: " + Arrays.toString(numbers1));
        System.out.println("Minimum: " + getMinimum(numbers1));
        System.out.println("Maximum: " + getMaximum(numbers1));
        int[] minMax1 = getMinAndMax(numbers1);
        System.out.println("Both Min & Max: " + minMax1[0] + ", " + minMax1[1]);

        System.out.println("\nOperation 2: Enter numbers one by one.");
        System.out.print("How many numbers will you enter? ");
        int count = scanner.nextInt();
        int[] numbers2 = new int[count];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < count; i++) {
            numbers2[i] = scanner.nextInt();
        }

        System.out.println("Numbers entered: " + Arrays.toString(numbers2));
        System.out.println("Minimum: " + getMinimum(numbers2));
        System.out.println("Maximum: " + getMaximum(numbers2));
        int[] minMax2 = getMinAndMax(numbers2);
        System.out.println("Both Min & Max: " + minMax2[0] + ", " + minMax2[1]);

        scanner.close();
    }
}