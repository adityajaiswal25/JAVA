import java.util.HashMap;
import java.util.Map;
public class hasmaparray {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5};
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("Element at index " + i + ": " + arr[i]);
        // }
        // for (int element : arr) {
        //     System.out.println("Element: " + element);
        // }
        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        // Add some key-value pairs to the HashMap
        map.put("india", 120);
        map.put("us", 30);
        map.put("China", 110);
        System.out.println("Initial HashMap: " + map);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
