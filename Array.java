import java.util.Scanner;
public class Array {
    public static void main(String args[]) {
    Scanner a = new Scanner(System.in);   //to take input from keyboard
    //int size = a.nextInt();    // read from the keyboard
    //int number[] = new int[size];
//input
/*for(int i=0; i<size;i++) {
    number[i] = sc.nextInt();

}
int  x = sc.nextInt();
//output
for(int i=0;i<number.length;i++) {
    if(number[i] == x) {
        System.out.println("x found at index :" + i);   
    }     */
/*int[] marks = { 45,67,90};
System.out.println(marks);
System.out.println(marks.length);
System.out.println(marks[1]);    
*/
int row = a.nextInt();
int col = a.nextInt();
                                        //2D array
int [][] number = new int [row][col];
 for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
       number[i][j] = a.nextInt();
    }
 }

 int x = a.nextInt();
 for (int i = 0; i< row; i++) {
    for (int j = 0; j < col; j++) {
        number[j][i] = a.nextInt();
       if(number[i][j] == x) {
            System.out.println("x found at location (" + i + ", " + j + ")");
       }
       
    }
    
    }
   a.close(); 
  }
}







