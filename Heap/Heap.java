import java.util.*;
public class Heap {
    ArrayList<Integer> heap;
    int size;

    public Heap() {
        this.heap = new ArrayList<>();
        size = 0;
    }
    int parent(int i){
        return (i-1)/2;
    }
    int leftChild(int i){
        return 2*i+1;
    }
    int rightChild(int i){
        return 2*i+2;
    }

    public void push(int value) {
        heap.add(value);
        int i = size;
        size++;
        while(i!=0){
            if(heap.get(i)>heap.get(parent(i))){
                int temp = heap.get(i);
                heap.set(i,heap.get(parent(i)));
                heap.set(parent(i),temp);
                i = parent(i);
            }
            else{
                break;
            }
        }

    }

    public int top() {
        if(isEmpty()){
            return -1;
        }
        return heap.get(0);

    }

    public int pop() {
        if(isEmpty()){
            return -1;
        }
        int ans = heap.get(0);
        heap.set(0,heap.get(size-1));
        heap.remove(size-1);
        size--;
        int i = 0;
        while(i<size){
            int left = leftChild(i);
            int right = rightChild(i);
            if(left<size && heap.get(left)>heap.get(i)){
                int temp = heap.get(i);
                heap.set(i,heap.get(left));
                heap.set(left,temp);
                i = left;
            }
            else if(right<size && heap.get(right)>heap.get(i)){
                int temp = heap.get(i);
                heap.set(i,heap.get(right));
                heap.set(right,temp);
                i = right;
            }
            else{
                break;
            }
        }

        return ans;
    }


    int size(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.push(1);
        h.push(2);
        h.push(3);
        h.push(4);
        h.push(5);
        System.out.println(h.heap);
        System.out.println(h.pop());
        System.out.println(h.heap);
        System.out.println(h.top());

    }
}