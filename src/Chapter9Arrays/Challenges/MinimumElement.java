package Chapter9Arrays.Challenges;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of int in the array");
        return scanner.nextInt();
    }

    private static int[] readElements(int a){

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[a];
        System.out.println("Enter the array: ");
        for(int i=0;i<a;i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }
    private static int findMin(int[] array){
        int min = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
