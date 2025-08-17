public class recursion {
    public static void printnumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printnumbers(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing numbers from " + n + " to 1:");
        printnumbers(n);
        System.out.println(); // For better readability
    }
    
}
