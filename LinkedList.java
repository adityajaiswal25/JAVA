public class LinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add element at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add element at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete element by value
    public boolean delete(int data) {
        if (head == null) {
            return false;
        }

        if (head.data == data) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Get element at specific index
    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }

        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }

    // Peek at the first element
    public Integer peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    // Get size of the list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
