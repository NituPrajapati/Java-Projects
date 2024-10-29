import java.util.*;
public class queue {
    static class que{
        static int arr[];
        static int size;
        static int rear =-1;
       // private static Object retrun;
        que(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public  void add(int data){
            if(rear==size-1){
               System.out.println("OVERFLOW");
               return;
            }
            else {
                rear++;
                arr[rear]=data;
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("UNDERFLOW");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
              arr[i]=arr[i+1];
            }
            rear--;
            return front;
            }
        public static int display(){
            if(isEmpty()){
                System.out.println("UNDERFLOW");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
     //  front=| 1  | 2  |  3  |  4  |  5  |=rear  
    que q = new que(5);
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.remove();
    //q.add(5);
    while(!q.isEmpty()) {
        System.out.println(q.display());
        q.remove();
     }
 }
}
