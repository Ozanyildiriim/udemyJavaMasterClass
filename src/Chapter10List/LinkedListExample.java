package Chapter10List;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Tokyo");
        placesToVisit.add(0,"Sdney");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String > list){
        list.add("Darwin");
        list.add("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowomba");
        //StackMethods
        list.push("First");
    }

    private static void removeElements(LinkedList<String > list){

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2+ " was removed");

        String s3 = list.removeLast();
        System.out.println(s3+ " was removed");


    }

}
