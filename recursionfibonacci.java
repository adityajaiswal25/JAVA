public class recursionfibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: fibonacci(0) = 0, fibonacci(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
    public static void main(String[] args) {
        int n =7 ; // Example input
        System.out.print("Fibonacci series up to " + n + " terms: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(); // New line after series
    }
    
}
