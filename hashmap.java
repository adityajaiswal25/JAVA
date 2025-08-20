 import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the HashMap
        map.put("india", 120);
        map.put("us", 30);
        map.put("China", 110);
        System.out.println("Initial HashMap: " + map);
        map.put("China",180);
        System.out.println("After updating China: " + map);
        // Check if a key exists
        if (map.containsKey("us")) {
            System.out.println("Key 'us' exists in the map with value: " + map.get("us"));
        } else {
            System.out.println("Key 'us' does not exist in the map.");

        }
        // get the value associated with a key
        int value = map.get("india");
        System.out.println("Value associated with key 'india': " + value);


    }
    
}
