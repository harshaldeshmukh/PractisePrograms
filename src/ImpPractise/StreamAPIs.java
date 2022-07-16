package ImpPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIs {
    public static void main(String[] args) {
        //https://howtodoinjava.com/java/stream/java-streams-by-examples/

        List<String> data = new ArrayList<>();
        data.add("Harshal");
        data.add("Pranav");
        data.add("Bitesh");


        data.stream().filter(s ->
                s.startsWith("H")
        ).forEach(System.out::println);

        data.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        List<String> result = data.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);

        long count = data.stream().filter(s -> s.startsWith("H")).count();
        System.out.println(count);
    }
}
