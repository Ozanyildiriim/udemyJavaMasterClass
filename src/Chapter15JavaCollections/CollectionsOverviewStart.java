package Chapter15JavaCollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class CollectionsOverviewStart {

    public static void main(String[] args) {

        Collection<String > list = new HashSet<>();

        String[] names = {"Ozan","Yiğit","Arda"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George","Fred","Harry"));
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("George"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("George is in the list? " + list.contains("George"));
//        list.sort();

    }
}
