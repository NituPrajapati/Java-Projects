class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
class BinaryTree {
    Node root;
    void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    
    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

       
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal:");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Postorder traversal:");
        tree.postorder(tree.root);
        System.out.println();
    }
}
