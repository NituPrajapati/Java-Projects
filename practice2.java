import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println("number:");
      sc.nextInt();
      
      /*int mul = 1;
      for (int i =1; i< n; i++) {
        mul *= i;

      }
      System.out.println(mul);   */

      int sum =0;
      while (n>0) {
        //int lastDigit = n%10;
        
        n=n/10;
        sum = sum+(n*n*n);
      }
      System.out.println(sum);
      int arr[]={5,7,8,'g'}; //g retrun its ascii value
      for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
      }
    sc.close();
    }
}
