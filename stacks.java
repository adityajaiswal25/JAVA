public class stacks {
    public static void main(String[] args) {
        MyStack nums = new MyStack(5);
        
        nums.push(10);
        nums.push(30);
        System.out.println("Popped: " + nums.pop());
        nums.push(70);
        nums.push(20);
        
        System.out.println("Stack contents:");
        nums.display();
        System.out.println("Top element: " + nums.peek());
        System.out.println("Stack size: " + nums.size());
    }
}
