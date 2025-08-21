public class treemain {
    public static void main(String[] args) {
        // Create a binary tree
        BinaryTree tree = new BinaryTree();
        
        // Insert values into the tree
        System.out.println("Inserting values: 50, 30, 70, 20, 40, 60, 80");
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        
        // Display tree information
        System.out.println("\nTree Information:");
        System.out.println("Height: " + tree.height());
        System.out.println("Total nodes: " + tree.countNodes());
        
        // Display traversals
        System.out.println("\nInorder traversal (sorted):");
        tree.inorder();
        
        System.out.println("Preorder traversal:");
        tree.preorder();
        
        System.out.println("Postorder traversal:");
        tree.postorder();
        
        System.out.println("Level order traversal:");
        tree.levelOrder();
        
        // Search for values
        System.out.println("\nSearching for values:");
        int[] searchValues = {30, 25, 80};
        for (int val : searchValues) {
            System.out.println(val + " found: " + tree.search(val));
        }
        
        // Delete a value and show the tree
        System.out.println("\nDeleting 30...");
        tree.delete(30);
        System.out.println("Inorder after deletion:");
        tree.inorder();
        
        // Check if tree is empty
        System.out.println("\nIs tree empty? " + tree.isEmpty());
    }
}
