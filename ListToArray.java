import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        
        Integer[] array = list.toArray(new Integer[0]);

        
        System.out.println("Array elements:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
