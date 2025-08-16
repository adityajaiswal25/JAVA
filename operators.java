public class operators {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // //b = a++;
        // b = ++a; // Pre-increment: a is incremented before assignment
        // System.out.println("Value of a after a++: " + a); // 11
        // System.out.println("Value of b after b = a++: " + b); //
        //bitwise operators
        int x = 5; // 0101 in binary
        int y = 3; // 0011 in binary
        int andResult = x & y; // Bitwise AND
        int orResult = x | y; // Bitwise OR
        int xorResult = x ^ y; // Bitwise XOR
        int notResult = ~x; // Bitwise NOT
        int leftShiftResult = x << 1; // Left shift
        int rightShiftResult = x >> 1; // Right shift
        System.out.println("Bitwise AND: " + andResult); // 1 (0001 in binary)
        System.out.println("Bitwise OR: " + orResult); // 7 (0111 in binary)
        System.out.println("Bitwise XOR: " + xorResult); // 6 (0110 in binary)
        System.out.println("Bitwise NOT: " + notResult); // -6 (in  two's complement)
        System.out.println("Left Shift: " + leftShiftResult); // 10 (1010 in binary)
        System.out.println("Right Shift: " + rightShiftResult); // 2 (001 1 in binary)
    }  
}
