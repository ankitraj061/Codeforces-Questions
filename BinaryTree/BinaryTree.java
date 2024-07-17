class Node{
    int data;
    Node left;
    Node right;
    Node parent;
    Node(int data){ 
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
public class BinaryTree {

    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            Node temp = this.root;
            while (true) {
                if (data < temp.data) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else if (data > temp.data) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    public void printTree(Node temp) {
        
        if(temp!=null){
            System.out.println(temp.data);
            printTree(temp.left);
            printTree(temp.right);
        }

    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(17);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.insert(11);
        tree.insert(13);
        tree.insert(16);
        tree.insert(16);
        tree.printTree( tree.root);
        
        
    }
}