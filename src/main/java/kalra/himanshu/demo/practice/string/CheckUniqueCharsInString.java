package kalra.himanshu.demo.practice.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckUniqueCharsInString {
    public static void main(String[] args) {
        String str = "adfsghjklgkjfhdgf";
        Map<Integer, Integer> res0 = str.chars().map(i -> (char) i).boxed().collect(Collectors.toMap(c -> c, c -> 1, (a, b) -> a + b));
        Map<Integer, Long> res01 = str.chars().map(i -> (char) i).boxed().collect(Collectors.toMap(c -> c, c -> 1L, Long::sum));
        Map<Integer, Integer> res1 = str.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));

        Map<Character, Long> res12 = str.chars().mapToObj(a-> (char) a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(res0);
        System.out.println(res1);
        System.out.println(res12);

        try {
            str = "asdfghjkla";
            Map<Integer, Long> res012 = str.chars().map(i -> (char) i).boxed().collect(Collectors.toMap(c -> c, c -> 1L, (a, b) -> {
                throw new RuntimeException("Duplicate Numbers");
            }));
            System.out.println("NON Duplicate Numbers");
        }catch (Exception e){
            System.out.println("Duplicate Numbers");;
        }


        char[] charArray = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

        // Convert char[] to a frequency map using streams
        Map<Character, Long> charFrequencyMap = IntStream.range(0, charArray.length)
                .mapToObj(i -> charArray[i])  // Convert each int to char
                .filter(c -> !Character.isWhitespace(c)) // Optional: Ignore whitespace
                .collect(Collectors.groupingBy(
                        Function.identity(), // Key: Character itself
                        Collectors.counting() // Value: Count occurrences
                ));

        // Print the frequency map
        System.out.println(charFrequencyMap);

        Map<Character, Long> res2 = IntStream.range(0, charArray.length).mapToObj(i -> charArray[i]).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
