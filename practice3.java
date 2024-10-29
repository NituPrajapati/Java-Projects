import java.util.*;
public class practice3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int number[] = new int[size];
    /*String name[] = new String[size];
    //input
    for (int i = 0; i < size;i++) {
       name[i] = sc.next(); 
    }
    for (int i = 0;i < name.length; i++) {
       System.out.println("name :" + (i+1) + name[i]); 
    }
*/
   /*  int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i< size; i++) {
       number[i] = sc.nextInt(); 
    }
    for (int i= 0; i < number.length; i++) {
        if(number[i] <min ) {
            min = number[i];
        }
        if(number[i] > max) {
            max = number[i];
        }
        }
        System.out.println("larger number is : " + max);
        System.out.println("Minimum number is : " + min);  */
        for (int i= 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for (int i = 0; i < number.length-1; i++) {
            if(number[i] > number[i+1]) {
                isAscending = false;
            }
        }
        if(isAscending) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }

    sc.close();
    }

   } 

