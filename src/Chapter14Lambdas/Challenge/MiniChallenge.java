package Chapter14Lambdas.Challenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MiniChallenge {

    public static void main(String[] args) {

        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for(String part: parts){
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for(String part: parts){
                System.out.println(part);
            }
        };

        printWords.accept("Lest split into array: ");
        printWordsLambda.accept("Lest split into array: ");

        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printWordsForEach.accept("Lest split into array: ");

        Consumer<String> printWordsConcise= sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printWordsConcise.accept("Lest split into array: ");

        Function<String, String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondChar.apply("1234567890"));

        everySecondCharacter(everySecondChar,"1234567890");
        System.out.println(everySecondCharacter(everySecondChar,"1234567890"));

        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava2 = () -> {return "I love java";};

        System.out.println(iLoveJava.get());
        System.out.println(iLoveJava2.get());

    }

    public static String everySecondCharacter(Function<String, String> func,
                                       String source){
        return func.apply(source);

    }


}
