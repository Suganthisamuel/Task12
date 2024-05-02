import java.util.ArrayList;

public class RemoveAllElements {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");

        
        System.out.println("ArrayList before removing elements: " + arrayList);

        
        arrayList.clear();

        
        System.out.println("ArrayList after removing elements: " + arrayList);
    }
}

