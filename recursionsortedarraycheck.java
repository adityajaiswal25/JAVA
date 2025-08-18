public class recursionsortedarraycheck {
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true; // Base case: if we reach the last element, the array is sorted
        }
        if (arr[index] > arr[index + 1]) {
            return false; // If current element is greater than next, array is not sorted
        }
        return isSorted(arr, index + 1); // Recursive case: check next pair of elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example input
        boolean result = isSorted(arr, 0);
        System.out.println("Is the array sorted? " + result);
    }
    
}
