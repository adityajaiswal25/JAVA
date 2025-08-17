public class bitwise {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos; // Create a bitmask for the specified position
        if ((n & bitMask) == 0) {
            System.out.println("Bit at position " + pos + " is OFF");
        } else {
            System.out.println("Bit at position " + pos + " is ON");
        }
        //set bit
        int setBit = n | bitMask; // Set the bit at position pos
        System.out.println("After setting bit at position " + pos + ": " + setBit);
        // clear bit
        int clearBit = n & ~bitMask; // Clear the bit at position pos
        System.out.println("After clearing bit at position " + pos + ": " + clearBit);
        //update bit
        int updateBit = n ^ bitMask; // Toggle the bit at position pos
        System.out.println("After toggling bit at position " + pos + ": " + updateBit);
    }
    
}
