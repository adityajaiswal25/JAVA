public class recursionxpown {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1; // Base case: x^0 = 1
        }
        return x * power(x, n - 1); // Recursive case: x^n = x * x^(n-1)
    }

    public static void main(String[] args) {
        int x = 3; // Base
        int n = 3; // Exponent
        int result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
    
}
