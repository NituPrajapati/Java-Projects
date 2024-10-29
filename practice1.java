import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    //1!+2!+3!+4! = 33
    /*int fact =1;
    int sum =0;
    for (int i= 1; i <=n; i++) {
            fact = fact*i;
            sum += fact;
       }
    System.out.println(sum);   */
    /*int mul =1;
    for (int i=1;i<=n;i++) {
       mul=n*n*n; 
    }
    System.out.println(mul);   */
    int row = sc.nextInt();
    int col = sc.nextInt();

    int number[] [] = new int[row][col];      //wrong
    for(int i=0;i<row;i++) {
      for(int j=0;j<col;j++) {
         number[i][j] = sc.nextInt();
      }
    }  
    for (int i = 0; i<row; i++) {
      for (int j= 0; j< col; j++) {
         number[j][i] = sc.nextInt();
      }
      
    }
    sc.close();
    } 
}

