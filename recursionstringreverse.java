public class recursionstringreverse {
    public static void reverseAndPrint(String str) {
        if (str.isEmpty()) {
            return; // Base case: empty string
        }
        // Recursive case: print last character first, then process the rest
        System.out.println(str.charAt(str.length() - 1));
        reverseAndPrint(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String input = "Hello"; // Example input
        System.out.println("Reversed string of '" + input + "' printed letter by letter:");
        reverseAndPrint(input);
    }
    
}
