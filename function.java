import java.util.*;
public class function {
  /*public static int printSum(int a,int b) {
    int sum = a + b;
    return sum; 
  } */
 public static void factNum(int a) {
    if(a<0) {
        System.out.println("Invalid Number.");
        return;
    }
    int fact = 1;
    for(int i=a;i>=1;i--) {
     fact = fact*i;
    }
    System.out.println(fact);
    return;
    
 }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    //int sum = printSum(a,b);
    //System.out.println("Sum of Number is :" + sum);
    factNum(a);
    sc.close();
}
}