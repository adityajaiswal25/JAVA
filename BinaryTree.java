public class BinaryTree {
    // Node class representing each node in the tree
    public static class Node {
        int data;
        Node left;
        Node right;
        
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    private Node root;
    
    // Constructor
    public BinaryTree() {
        this.root = null;
    }
    
    // Insert a value into the tree (level order insertion)
    public void insert(int data) {
        root = insertRec(root, data);
    }
    
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        
        return root;
    }
    
    // Search for a value in the tree
    public boolean search(int data) {
        return searchRec(root, data);
    }
    
    private boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        }
        
        if (data == root.data) {
            return true;
        }
        
        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }
    
    // Delete a value from the tree
    public void delete(int data) {
        root = deleteRec(root, data);
    }
    
    private Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }
        
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            // Node to be deleted found
            
            // Case 1: Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            
            // Case 2: Node with two children
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        
        return root;
    }
    
    private int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
    
    // Inorder traversal (Left, Root, Right)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }
    
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    
    // Preorder traversal (Root, Left, Right)
    public void preorder() {
        preorderRec(root);
        System.out.println();
    }
    
    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    
    // Postorder traversal (Left, Right, Root)
    public void postorder() {
        postorderRec(root);
        System.out.println();
    }
    
    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
    
    // Level order traversal (Breadth-first)
    public void levelOrder() {
        if (root == null) {
            return;
        }
        
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
        System.out.println();
    }
    
    // Get height of the tree
    public int height() {
        return heightRec(root);
    }
    
    private int heightRec(Node root) {
        if (root == null) {
            return -1; // Return -1 for empty tree, 0 for single node
        }
        
        int leftHeight = heightRec(root.left);
        int rightHeight = heightRec(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    // Count total nodes
    public int countNodes() {
        return countNodesRec(root);
    }
    
    private int countNodesRec(Node root) {
        if (root == null) {
            return 0;
        }
        
        return 1 + countNodesRec(root.left) + countNodesRec(root.right);
    }
    
    // Check if tree is empty
    public boolean isEmpty() {
        return root == null;
    }
    
    // Get root node (for testing purposes)
    public Node getRoot() {
        return root;
    }
}
