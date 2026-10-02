package Chapter9Arrays.Challenges;

import java.util.Scanner;

public class minimumElementChallenge {

//    public static void main(String[] args) {
//
//        int[] numbers = readIntegers();
//
//        System.out.println("Entered numbers: " + Arrays.toString(numbers));
//
//        int minimum = findMin(numbers);
//
//        System.out.println("Minimum number: " + minimum);
//    }

    public static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    public static int findMin(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
