import java.util.*;

public class ArrayList6{
    public static void main(String[] args){
        List<String> arrayList=new ArrayList<>();
        arrayList.add("green");
        arrayList.add("red");
        arrayList.add("blue");
        
        arrayList.stream().forEach(System.out::println);
    }
}
