public class patterns {
    public static void main(String[] args) {
        System.out.println("pattern");

        /*for(int i=0;i<=3;i++) {
            for(int j=0;j<=3;j++) {        //solid recangle
              System.out.print("*");
            }
            System.out.println();
        } */
       //Hollow rectangle
       /*int m=4;
       int n=5;
       for(int i=1;i<=m;i++)  {
        for(int j=1;j<=n;j++)  {
           if(i==1 || j==1 || i==n || j==m)   {
            System.out.print("*");
           } else {
            System.out.print(" ");
           }
        }
        System.out.println();
       }  */
       //half pyramid
       /*for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++) {
            System.out.print("*");
        }
        System.out.println();
       }  */
      /*for(int i=1;i<=5;i++) {
        for(int j=i;j<=5;j++) {        //inverted half pyramid
            System.out.print("*");
        }
        System.out.println();
      } */
     /*int n=5;
     for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");   //half inverted pyramid(180 degree rotate)
        }
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
     } */
    /*for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++) {
            System.out.print(j);
        }                                     //half pyramid with number
        System.out.println();
      }   */
     /*int n=5;
     for(int i=1;i<=n;i++){          inverted half pyramid with number
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
            System.out.println();
     } */
     /* int n=5;
      int num=1;           //floyd triaagle
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
      }  */
      //0 - 1 traigle  i=row
      int n =5;
      for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++) {
        int sum = i+j;
        if(sum % 2 == 0) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
        }
        System.out.println();
      }
    }
}