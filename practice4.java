
public class practice4 {
    //fibonachi series
  public static void num(int a){
    int t1=0;
    int t2=1;
    int next;
    for(int i=0;i<a;i++) {
      next=t1+t2;
      t1=t2;
      t2 = next;
      System.out.println(next );
    }
    
    
  }
      
      public static void main(String[] args) {
        //Scanner a = new Scanner(System.in);
        //int n = a.nextInt();
          /*int[] arr= {2,7,5,3,1};
          for(int i=0;i<arr.length;i++){
              for(int j= i+1;j<arr.length;i++) {
                if(arr[i] >arr[j]) {
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                }
              }
           }
           for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
            if(i<arr.length - 1){
              System.out.println(" ,");
            }
           }   */
          num(10);
          
            }
          }      
            
        
              
        
          
          
        
  
      
  
  