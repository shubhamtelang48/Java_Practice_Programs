package JavaPrograms;

import java.sql.Array;
import java.util.Arrays;

public class RowColSearch {
    public static void main(String[] args) {
        int[][] arr={
                {11,23,34,56,67},
                {22,35,57,68,89},
                {33,39,60,70,90},
                {37,44,66,77,99}
        };

        System.out.println(Arrays.toString(search(arr,35)));

    }

    static int[] search(int [][] arr,int target){

        int r=0;
        int c=arr.length-1;

        while (r<arr.length-1 && c>=0){
            if(target==arr[r][c])
            {
                return new int[]{r,c};
            } else if (target>arr[r][c])
            {
                r++;
            }
            else
             {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
