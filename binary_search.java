public class binary_search {

        public static int binarySearch(int[] arr, int target) {
            int lb = 0;
            int ub= arr.length - 1;
    
            while (lb <= ub) {
                int mid = lb + (ub - lb) / 2;
    
                if (arr[mid] == target) {
                    return mid; 
                }
    
                if (arr[mid] < target) {
                    lb= mid + 1;
                } 
                else {
                   ub = mid - 1;
                }
            }
            return -1; 
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 3, 4, 10, 40}; 
            int target = 10; 
    
            int result = binarySearch(arr, target);
            if (result == -1) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found at index: " + result);
            }
        }
    }
    

