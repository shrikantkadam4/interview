import java.util.*;

public class ArrayList2{
    public static void main(String[] args){
        List<String> arrayList = List.of("green", "red", "blue");
        arrayList.stream().forEach(System.out::println);
    }
}
