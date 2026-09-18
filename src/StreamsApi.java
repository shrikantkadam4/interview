import java.util.*;

public class StreamsApi{
    public static void main (String[] args){
        List<String> colors=List.of("red", "green", "blue");
        List<String> shapes=List.of("circle","triangle","square");

        colors.stream()
                .flatMap(c -> shapes.stream().map(s -> c + " - " + s))
                .forEach(System.out::println);
    }
}