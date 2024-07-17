public class genric {
    static class Genric<T>{
        T data;
        Genric(T data){
            this.data = data;
        }
        public void display(){
            System.out.println("type of data is "+this.data.getClass().getName());
        }
        public T getData(){
            return this.data;
        }
    }
    public static void main(String[] args) {
        Genric<Integer> g = new Genric<Integer>(10);
        g.display();
        
    }
}
