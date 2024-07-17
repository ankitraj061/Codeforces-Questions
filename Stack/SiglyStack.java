class Node{
    int data;
    Node next;
    int size;
    Node(int data){
        this.data = data;
        this.next = null;
        this.size = 0;
    }

}
class Stack{

    Node head;
    int size;
    Stack(){
        this.head = null;
        this.size = 0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }
    
    public int size(){
        return size;
    }

    public int  pop(){
        if(head == null){
            System.out.println("Stack is empty");
            return head.data;
        }   
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }
    public int top(){
        if(head == null){
            System.out.println("Stack is empty");
            return head.data;
        }
        return head.data;
    }
}
public class SiglyStack{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        System.out.println(s.size());
        System.out.println(s.top());
        System.out.println(s.pop());
        s.display();
        System.out.println(s.size());
    }
}