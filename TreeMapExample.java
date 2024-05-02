import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "David");
        employeeMap.put(105, "Emma");

        
        System.out.println("Names of all employees in alphabetical order:");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}
