public class Insert {
    Node head;

    class Node {
        int data;
        Node next;
        static int size = 0;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        Node.size++; // Increase size after inserting
    }

    public void insertAtBeginning(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        Node.size++; // Increase size after inserting
    }

    // Method to get the size of the linked list
    public int size() {
        return Node.size;
    }
    public void insert(int loc, int new_data) {
        if(loc < 0 || loc > Node.size) {
            System.out.println("Invalid location");
            return;
        }
        Node new_node = new Node(new_data);
        if (loc == 0) {
            insertAtBeginning(new_data);
        }
        else if(loc == Node.size) {
            insertAtEnd(new_data);
        }
        else {
            Node temp = head;
            for(int i = 0; i < loc - 1; i++) {
                temp = temp.next;
            }
            new_node.next = temp.next;
            temp.next = new_node;

        }
        Node.size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" --> ");
            }
            temp = temp.next;
        }
    }
    public void delete(int loc) {
        if(loc < 0 || loc > Node.size) {
            System.out.println("Invalid location");
            return;
        }
        Node temp = head;
        if(loc == 0) {
            head = temp.next;
        }
        else {
            for(int i = 0; i < loc - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            
        }
        Node.size--;
        
        
    }
    public int search(int key) {
        if(head == null) {
            return -1;
        }
        Node temp = head;
        int index = 0;
        while(temp != null) {
            if(temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Insert llist = new Insert();

        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(3);
        llist.insertAtEnd(4);
        llist.insertAtEnd(5);
        System.out.println("Size: " + llist.size());
        llist.display();
        llist.insertAtBeginning(50);
        System.out.println("\nSize: " + llist.size());
        llist.display();
        System.out.println();
        llist.insert(3, 100);
        llist.display();
    }
}
