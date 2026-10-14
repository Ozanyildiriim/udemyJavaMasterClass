package Chapter10List;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Tokyo");
        placesToVisit.add(0,"Sydney");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);
//        printItinerary2(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String > list){
        list.add("Darwin");
        list.add("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowomba");
        //StackMethods
        list.push("Alice Springs");
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

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin retrieved at = " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        //Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        //Stack retrieval method
        System.out.println("Element from peek,()  = " + list.peek());
        System.out.println("Element from peek,()  = " + list.peekFirst());
        System.out.println("Element from peek,()  = " + list.peekLast());
    }


    public static void printItinerary(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        for(int i=1;i < list.size(); i++){
            System.out.println("-->From: " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list){
            System.out.println("-->From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String > iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("-->From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")){
                iterator.add("Lake Wivenhoe");
            }
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }

}
