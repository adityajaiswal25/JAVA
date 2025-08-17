public class recursionfactorial {
    public static int factorial(int f) {
        if(f == 0) {
            return 1; // Base case: factorial of 0 is 1
        }
        return f*factorial(f-1); // Recursive case: f * factorial of (f-1)
    }
    public static void main(String[] args) {
        int f = 5; // Example input
        int result = factorial(f);
        System.out.println("Factorial of " + f + " is: " + result);
    }

    
}
