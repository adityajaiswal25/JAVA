public class recursionfirstlastocc {
    public static int firstOccurrence(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1; // Base case: target not found
        }
        if (arr[index] == target) {
            return index; // Found the first occurrence
        }
        return firstOccurrence(arr, target, index + 1); // Recursive case
    }

    public static int lastOccurrence(int[] arr, int target, int index) {
        if (index < 0) {
            return -1; // Base case: target not found
        }
        if (arr[index] == target) {
            return index; // Found the last occurrence
        }
        return lastOccurrence(arr, target, index - 1); // Recursive case
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5}; // Example array
        int target = 2; // Target value to find
        int firstIndex = firstOccurrence(arr, target, 0);
        int lastIndex = lastOccurrence(arr, target, arr.length - 1);
        
        System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
        System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
    }
    
}
