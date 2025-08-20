import java.util.*;

/**
 * Comprehensive HashMap implementation demonstrating various hashing techniques
 * and collision resolution methods with detailed explanations
 */
public class hashmap2 {
    
    // Custom hash function demonstrations
    public static class HashingFunctions {
        
        /**
         * Division Method: h(k) = k mod m
         * Simplest hashing method where m is table size
         */
        public static int divisionMethod(int key, int tableSize) {
            return Math.abs(key) % tableSize;
        }
        
        /**
         * Multiplication Method: h(k) = floor(m * (kA mod 1))
         * Where A is a constant between 0 and 1
         */
        public static int multiplicationMethod(int key, int tableSize) {
            double A = 0.6180339887; // Golden ratio conjugate
            double fractionalPart = (key * A) % 1;
            return (int) Math.floor(tableSize * fractionalPart);
        }
        
        /**
         * Folding Method: Split key into parts and add them
         * Good for string keys or large numbers
         */
        public static int foldingMethod(String key, int tableSize) {
            int hash = 0;
            for (int i = 0; i < key.length(); i++) {
                hash += key.charAt(i);
            }
            return hash % tableSize;
        }
        
        /**
         * Polynomial Rolling Hash for strings
         * h(s) = (s[0]*p^(n-1) + s[1]*p^(n-2) + ... + s[n-1]) mod m
         */
        public static int polynomialRollingHash(String key, int tableSize) {
            int p = 31; // Prime number
            int hash = 0;
            int power = 1;
            
            for (int i = 0; i < key.length(); i++) {
                hash = (hash + (key.charAt(i) - 'a' + 1) * power) % tableSize;
                power = (power * p) % tableSize;
            }
            return hash;
        }
    }
    
    // Custom Hash Table implementation with collision resolution
    public static class CustomHashTable<K, V> {
        private class Entry<K, V> {
            K key;
            V value;
            Entry<K, V> next; // For chaining
            
            Entry(K key, V value) {
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }
        
        private Entry<K, V>[] table;
        private int capacity;
        private int size;
        
        @SuppressWarnings("unchecked")
        public CustomHashTable(int capacity) {
            this.capacity = capacity;
            this.table = new Entry[capacity];
            this.size = 0;
        }
        
        /**
         * Hash function using division method
         */
        private int hash(K key) {
            return Math.abs(key.hashCode()) % capacity;
        }
        
        /**
         * Insert key-value pair with collision handling using chaining
         */
        public void put(K key, V value) {
            int index = hash(key);
            Entry<K, V> newEntry = new Entry<>(key, value);
            
            if (table[index] == null) {
                table[index] = newEntry;
            } else {
                // Collision detected - use chaining
                Entry<K, V> current = table[index];
                while (current.next != null) {
                    if (current.key.equals(key)) {
                        current.value = value; // Update existing key
                        return;
                    }
                    current = current.next;
                }
                
                if (current.key.equals(key)) {
                    current.value = value; // Update existing key
                } else {
                    current.next = newEntry; // Add to chain
                }
            }
            size++;
        }
        
        /**
         * Retrieve value by key
         */
        public V get(K key) {
            int index = hash(key);
            Entry<K, V> current = table[index];
            
            while (current != null) {
                if (current.key.equals(key)) {
                    return current.value;
                }
                current = current.next;
            }
            return null; // Key not found
        }
        
        /**
         * Display the entire hash table structure
         */
        public void display() {
            System.out.println("\nHash Table Structure:");
            for (int i = 0; i < capacity; i++) {
                System.out.print("Bucket " + i + ": ");
                Entry<K, V> current = table[i];
                while (current != null) {
                    System.out.print("[" + current.key + "=" + current.value + "] -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== HASHING TECHNIQUES DEMONSTRATION ===\n");
        
        // 1. Demonstrate different hash functions
        System.out.println("1. HASH FUNCTION DEMONSTRATIONS");
        System.out.println("--------------------------------");
        
        int key = 12345;
        int tableSize = 10;
        
        System.out.println("Key: " + key + ", Table Size: " + tableSize);
        System.out.println("Division Method: " + HashingFunctions.divisionMethod(key, tableSize));
        System.out.println("Multiplication Method: " + HashingFunctions.multiplicationMethod(key, tableSize));
        
        String stringKey = "hello";
        System.out.println("\nString Key: " + stringKey);
        System.out.println("Folding Method: " + HashingFunctions.foldingMethod(stringKey, tableSize));
        System.out.println("Polynomial Rolling Hash: " + HashingFunctions.polynomialRollingHash(stringKey, tableSize));
        
        // 2. Demonstrate collision handling
        System.out.println("\n2. COLLISION HANDLING DEMONSTRATIONS");
        System.out.println("-----------------------------------");
        
        CustomHashTable<String, Integer> hashTable = new CustomHashTable<>(5);
        
        // Insert data that will likely cause collisions
        String[] keys = {"apple", "banana", "cherry", "date", "elderberry", "fig"};
        int[] values = {1, 2, 3, 4, 5, 6};
        
        for (int i = 0; i < keys.length; i++) {
            hashTable.put(keys[i], values[i]);
            System.out.println("Inserted: " + keys[i] + " = " + values[i]);
        }
        
        // Display the hash table structure
        hashTable.display();
        
        // 3. Demonstrate Java's built-in HashMap
        System.out.println("\n3. JAVA BUILT-IN HASHMAP DEMONSTRATION");
        System.out.println("-------------------------------------");
        
        HashMap<String, Integer> javaHashMap = new HashMap<>();
        
        // Add elements
        javaHashMap.put("John", 25);
        javaHashMap.put("Alice", 30);
        javaHashMap.put("Bob", 35);
        javaHashMap.put("Charlie", 28);
        
        System.out.println("HashMap contents: " + javaHashMap);
        System.out.println("Size: " + javaHashMap.size());
        System.out.println("Contains 'Alice': " + javaHashMap.containsKey("Alice"));
        System.out.println("Alice's age: " + javaHashMap.get("Alice"));
        
        // 4. Demonstrate load factor and rehashing
        System.out.println("\n4. LOAD FACTOR AND PERFORMANCE");
        System.out.println("-----------------------------");
        
        // Create HashMap with custom load factor
        HashMap<String, Integer> customHashMap = new HashMap<>(16, 0.75f);
        
        // Add many elements to trigger rehashing
        for (int i = 0; i < 20; i++) {
            customHashMap.put("Key" + i, i * 10);
        }
        
        System.out.println("Custom HashMap size: " + customHashMap.size());
        System.out.println("Load factor used: 0.75 (default)");
        
        // 5. Demonstrate different collision resolution strategies
        System.out.println("\n5. COLLISION RESOLUTION STRATEGIES");
        System.out.println("----------------------------------");
        System.out.println("1. Chaining (used in our CustomHashTable)");
        System.out.println("   - Uses linked lists to handle collisions");
        System.out.println("   - Average case O(1) for insert/search/delete");
        System.out.println("   - Worst case O(n) when all keys hash to same bucket");
        
        System.out.println("\n2. Open Addressing");
        System.out.println("   - Linear Probing: h(k,i) = (h(k) + i) mod m");
        System.out.println("   - Quadratic Probing: h(k,i) = (h(k) + i²) mod m");
        System.out.println("   - Double Hashing: h(k,i) = (h1(k) + i*h2(k)) mod m");
        
        // 6. Performance comparison
        System.out.println("\n6. PERFORMANCE COMPARISON");
        System.out.println("------------------------");
        
        long startTime, endTime;
        
        // Test with built-in HashMap
        startTime = System.nanoTime();
        HashMap<Integer, String> performanceTest = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            performanceTest.put(i, "Value" + i);
        }
        endTime = System.nanoTime();
        System.out.println("Built-in HashMap: " + (endTime - startTime) + " ns");
        
        // Test with our CustomHashTable
        startTime = System.nanoTime();
        CustomHashTable<Integer, String> customTest = new CustomHashTable<>(1000);
        for (int i = 0; i < 1000; i++) {
            customTest.put(i, "Value" + i);
        }
        endTime = System.nanoTime();
        System.out.println("Custom HashTable: " + (endTime - startTime) + " ns");
    }
}
