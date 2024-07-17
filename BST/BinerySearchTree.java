class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinerySearchTree {
    Node root;
    int size;
    public BinerySearchTree(int val) {
        this.root = new Node(val);
        this.size = 1;
    }

    public void insert(int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            Node curr = root;
            while (true) {
                if (val > curr.val) {
                    if (curr.right == null) {
                        curr.right = new Node(val);
                        size++;
                        break;
                    } else {
                        curr = curr.right;
                    }
                } else if (val == curr.val) {
                    break;
                } else {
                    if (curr.left == null) {
                        curr.left = new Node(val);
                        size++;
                        break;
                    } else {
                        curr = curr.left;
                    }
                }
            }
        }
    }

    void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.val);
        print(root.right);
    }

    public boolean search(int val) {
        Node curr = root;
        while (curr != null) {
            if (val > curr.val) {
                curr = curr.right;
            } else if (val < curr.val) {
                curr = curr.left;
            } else {
                return true;
            }
        }
        return false;
    }

    public void remove(int val) {
        this.root = remove(this.root, val);
    }

    private Node remove(Node root, int val) {
        if (root == null) {
            return root;
        }
        if (val < root.val) {
            root.left = remove(root.left, val);
        } else if (val > root.val) {
            root.right = remove(root.right, val);
        } else {
            
            if (root.left == null && root.right == null) {
                root = null;
                size--; 
                return root;
            } else if (root.left == null) {
                root = root.right;
                size--; 
                return root;
            } else if (root.right == null) {
                root = root.left;
                size--; 
                return root;
            } else {
                Node temp = findMin(root.right);
                root.val = temp.val;
                root.right = remove(root.right, temp.val);
            }
        }
        return root;
    }

    private Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        BinerySearchTree bst = new BinerySearchTree(10);
        bst.insert(20);
        bst.insert(30);
        bst.insert(15);
        bst.insert(40);
        bst.insert(5);
        bst.print(bst.root);
        bst.insert(20);

        System.out.println("------------");

        System.out.println("Size = " + bst.size);

        System.out.println("25 is Present: " + bst.search(25));
        bst.remove(30);
        bst.print(bst.root);
    }
}