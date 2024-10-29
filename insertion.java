public class insertion {
    public static void main(String[] args) {
        int j,temp;
        int arr[]= {6,5,4,9};
        
         for(int i=1;i<=3;i++){
            temp = arr[i];
            j = i-1;
            while(j>=0 && temp<=arr[j]) {
                arr[j+1] = temp;
                j--;
            }
         }
            for(int i=0;i<=3;i++) {
                System.out.println(arr[i]);
            }

         }
    
    }

