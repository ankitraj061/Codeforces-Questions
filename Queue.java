class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class Queue {
    

    Node head = null;
    Node tail = null;
    int size=0;

    public void enqueue(int data) {
        Node newnode=new Node(data);
        if(head==null){
            newnode.next=null;
            head=newnode;
            tail=newnode;

        }
        else {
            newnode.next=null;
            tail.next=newnode;
            tail=newnode;
        }
        size++;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public int peek(){
        return head.data;
    }
    public int  dqueue(){
        if(head==null){
            System.out.println("Already empty queue!");
            return -1;
        }
        else {
            size--;
            int temp=head.data;
            head=head.next;
            return temp;
        }
        
    }
    public int size(){
        return size;
    }
    public void display(){
        if(head==null){
            System.out.print("No element in the queue");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(7);
        queue.display();//7
        System.out.println(queue.size());//1
        queue.enqueue(2);
        queue.enqueue(6);
        queue.display();//7 2 6
        System.out.println(queue.size());//3
        queue.enqueue(0);
        System.out.println(queue.dqueue());//7
       
        queue.display();//2 6 0
    }
}
    