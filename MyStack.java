public class MyStack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push operation
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = element;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Get current size of stack
    public int size() {
        return top + 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        
        stack.push(10);
        stack.push(30);
        System.out.println("Popped: " + stack.pop());
        stack.push(70);
        stack.push(20);
        
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
    }
}
