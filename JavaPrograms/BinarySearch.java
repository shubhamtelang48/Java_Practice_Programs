package JavaPrograms;

public class BinarySearch {

    static int binarySearch(int[] arr, int target){

        int start=0;
        int end= arr.length-1;


           // if arr is in ascending order

           while (start <= end) {
               int mid = start + (end - start) / 2;

               if(arr[start]<arr[end]) {

                   if (target > arr[mid]) {
                       start = mid + 1;
                   } else if (target < arr[mid]) {
                       end = mid - 1;
                   } else {
                       return mid;
                   }
               }
               else
               {
                   if (target < arr[mid]) {
                       start = mid + 1;
                   } else if (target > arr[mid]) {
                       end = mid - 1;
                   } else {
                       return mid;
                   }
               }

           }
        return -1;


    }

    static int celing(int[] arr,int target) {
        // celing is the number which is smallest of greter number than target

        int start=0;
        int end= arr.length-1;

        // if arr is in ascending order

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[start]<arr[end]) {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }

                else {
                    return mid;
                }
            }
            else
            {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }

        }
        return start;
    }

    static int floor(int[] arr,int target) {
        // floor is gretest number of smaller numbers than target
        // gretest <=target


        int start=0;
        int end= arr.length-1;


        // if arr is in ascending order

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[start]<arr[end]) {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            else
            {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return end;

    }

    public static void main(String[] args) {
        int[] arr1={2,5,9,12,18,20,28,35,39,45,50,67,78,89};
        int[] arr2={90,89,87,65,54,43,32,22,20,11,-10,-25};
        int target1=12;
        int target2=62;
        //int result=binarySearch(arr2,target2);
        int result1=celing(arr1,target2);
        int result2=floor(arr2,target2);
        System.out.println(result1);
    }
}
