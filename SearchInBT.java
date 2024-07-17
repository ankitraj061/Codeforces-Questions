class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class SearchInBT {
    Node root;

    public SearchInBT() {
        root = null;
    }

    public void insert(int data) {

        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
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
    public void printBT(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printBT(root.left);
        printBT(root.right);
    }

    public boolean search(int data) {
        Node temp=root;
        if(temp==null){
            return;
        }
        search(temp.left.data);
        if(root.data==data){
            return true;
        }
        search(temp.right.data);
        return false;
    }

    public static void main(String[] args) {

        SearchInBT tree = new SearchInBT();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(17);
        tree.insert(2);
        
        tree.printBT(tree.root);
        System.out.println(tree.search(15));


    }
}
