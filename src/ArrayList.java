import java.util.*;

public class ArrayList{
    public static void main(String[] args){
        List<String> arrayList = Arrays.asList("green", "red", "blue");
        arrayList.stream().forEach(System.out::println);
    }
}