import java.util.*;

public class ArrayList4{
    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("green");
        arrayList.add("red");
        arrayList.add("blue");
        
        arrayList.stream().forEach(System.out::println);
    }
}
