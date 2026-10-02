package Chapter9Arrays.Challenges;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array){

        System.out.println("Array = " + Arrays.toString(array));

        int MaxIndex = array.length-1;
        int halfLength = array.length/2;
        int temp;
        for(int i =0;i<halfLength;i++){
            temp = array[i];
            array[i] = array[MaxIndex-i];
            array[MaxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
