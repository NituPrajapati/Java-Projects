import java.util.*;
public class stackframework{
    
    public static void main(String[] args) {
     Stack<Integer> a = new Stack<>();
     a.push(1); 
     a.push(2); 
     a.push(3); 
     a.push(4);   
    
    while(!a.isEmpty()){
        System.out.println(a.peek());
        a.pop();
    }
 }
}
