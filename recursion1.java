public class recursion1 {
    public static int printPower(int x,int b ) {
       /* if(i ==n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printSum(i+1,n,sum);
        System.out.println(i); */
        /*if (n ==1 || n ==0) {
            return 1;
        }
        System.out.println(n);        //factorial
        int fact_n =  printFact(n-1);
        int fact_n1 = n* fact_n;
        
        return fact_n1; */
        /*if (n== 0) {
            return;
        }
        int c =a+b;       //fibonachi series
        System.out.println(c);
        printFib(b , c , n-1);  */
        if (b ==0) {
           return 1;
         }
         if (x == 0) {
            return 0;
         }            //x^n
         /*int pow1 = printPower(x, b - 1);
         int pow = x* pow1;
         return pow; */
         if (b%2 == 0) {  //if n is even
            return printPower(x, b/2) * printPower(x, b/2);
         }
         else {  //if n is odd
           return printPower(x, b/2) * printPower(x, b/2)*x;
         }
    
    } 
    public static void main(String[] args) {
        //sum of natural number
       // printSum(1,6,0);  
       /*int n= 5;
       int ans = printFact(n);                  //Factorial
       System.out.println(ans); */
       /*int a= 0,b =1;
       System.out.println(a);
       System.out.println(b);
       int n = 7;
       printFib(a, b, n-2);  */
       

       int x =3, b =5; 
       int ans = printPower(x, b);
       System.out.println(ans);
       
    }
}
