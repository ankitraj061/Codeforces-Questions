class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class CircularQueue{
    Node front, rear;
    int size = 0;
    CircularQueue(){
        front = null;
        rear = null;
    }
    boolean isEmpty(){
        if(front == null)
            return true;
        return false;
    }
    void enqueue(int d){
        Node temp = new Node(d);
        if(rear == null){
            rear = temp;
            front = temp;
            rear.next = front;
        }
        else{
            rear.next = temp;
            rear = temp;
            rear.next = front;
        }
        size++;
    }
    void  dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(front == rear){
            front = null;
            rear = null;
        }
        else{
            front = front.next;
            rear.next = front;
        }
        size--;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while(temp != rear){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
        
        
    }
}