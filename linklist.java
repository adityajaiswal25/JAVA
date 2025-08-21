public class linklist {
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();
        
        // Adding elements
        nums.add(5);
        nums.add(9);
        nums.addFirst(6);
        
        // Accessing elements
        System.out.println("Element at index 2: " + nums.get(2));
        System.out.println("Peek element: " + nums.peek());
        
        // Printing the list
        nums.printList();
        
        // Deleting an element
        nums.delete(9);
        System.out.println("After deleting 9:");
        nums.printList();
    }
}