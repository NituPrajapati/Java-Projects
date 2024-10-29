import java.util.*;
  public class queueFramework {

    public static void main(String[] args) {
        //Queue q = new queue();
        Queue<Integer> q = new LinkedList<>();
       // Queue<Integer> q = new ArrayDequeue<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
}
