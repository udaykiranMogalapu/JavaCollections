import java.util.TreeMap;
import java.util.Map;

public class TreeMap1 {

    public static void main(String[] args) {
       
        TreeMap<Integer, String> treeMap = new TreeMap<>();

       
        treeMap.put(3, "Charlie");
        treeMap.put(1, "Alice");
        treeMap.put(2, "Bob");

        // Retrieve values based on keys
        String name1 = treeMap.get(2);
        String name2 = treeMap.get(1);

        System.out.println("Name for key 2: " + name1);
        System.out.println("Name for key 1: " + name2);

        // Iterate through the TreeMap
        System.out.println("TreeMap Entries:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
