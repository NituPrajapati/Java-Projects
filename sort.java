//import java.util.*;
class sort {
    public static void printArray(int arr[])  {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,9,0,8,2,7,5};
        //bubble sort
        /*for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];                        //O(n^2)
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        } */
        //selection sort
        /*for (int i = 0; i< arr.length -1; i++) {
            int small = i;
            for (int j =i+1; j < arr.length; j++) {
                if(arr[small] > arr[j]) {                  //O(n^2)
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }    */

    //insertion sort
    for (int i = 0; i< arr.length; i++) {
        int current = arr[i];
        int j = i-1;
        while(j >=0 && current <arr[j]) {                  //O()
            arr[j+1] = arr[j];
            j--;
        } 
        arr[j+1] = current;
    }
    printArray(arr);
    }
}





