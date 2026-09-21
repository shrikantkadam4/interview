import java.util.*;

public class ArrayList5{
    public static void main(String[] args){
        List<String> arrayList=new ArrayList<String>();
        arrayList.add("green");
        arrayList.add("red");
        arrayList.add("blue");
        
        arrayList.stream().forEach(System.out::println);
    }
}
