public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        
        System.out.println("=== Queue Operations Demo ===");
        
        // Test enqueue operations
        System.out.println("\n--- Enqueue Operations ---");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        // Try to enqueue when queue is full
        queue.enqueue(60);
        
        // Display queue
        queue.display();
        
        // Test dequeue operations
        System.out.println("\n--- Dequeue Operations ---");
        queue.dequeue();
        queue.dequeue();
        
        // Display queue after dequeue
        queue.display();
        
        // Test peek operation
        System.out.println("\n--- Peek Operation ---");
        System.out.println("Front element: " + queue.peek());
        
        // Test more enqueue after dequeue
        System.out.println("\n--- More Enqueue Operations ---");
        queue.enqueue(60);
        queue.enqueue(70);
        
        // Display final queue
        queue.display();
        
        // Test isEmpty and isFull
        System.out.println("\n--- Queue Status ---");
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Is queue full? " + queue.isFull());
        System.out.println("Queue size: " + queue.getSize());
    }
}
