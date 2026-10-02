package Chapter10List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayAndArrayList {
    public static void main(String[] args) {

        String[] originalArray = new String[] {"First","Second","Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0,"one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: " + Arrays.toString(originalArray));

//        originalList.add("1");

        List<String> newList = Arrays.asList("Sunday","Monday","Tuesday");
        System.out.println(newList);

    }
}
