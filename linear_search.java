import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int arr[] = new int[size];
        //System.out.println("Enter 25 numbers:");
        
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter searched number:");
        int x = sc.nextInt();

        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x){
                System.out.println("X found at "+i+" position");
                count++;
            }
        
        }
        System.out.println(x+" present "+count+" times in Array.");
    sc.close();
           
}
}
