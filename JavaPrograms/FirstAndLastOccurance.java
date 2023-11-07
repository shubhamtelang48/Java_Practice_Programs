package JavaPrograms;

import java.util.Arrays;

public class FirstAndLastOccurance {


    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = occurance(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = occurance(nums, target, false);
        }
        return ans;
    }

    static int occurance(int[] arr, int target,boolean findStartIndex) {

        int start = 0;
        int end = arr.length - 1;
        int res=-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                res= mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr={5,6,7,7,7,9,23};
        int target=7;

        //int nums[0]=occurance(arr,target,true);
        //int nums[1]=occurance(arr,target,false);

        int[] result=searchRange(arr,target);
        System.out.println(Arrays.toString(result));


    }
}
