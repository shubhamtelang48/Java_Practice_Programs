package JavaPrograms;

import java.sql.*;
import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] arr={-10,-6,0,3,6,9};
        System.out.println(Arrays.toString(squareSorted(arr)));

    }
    static int[] squareSorted(int[] arr){
       int n=arr.length;
       int[] result=new int[n];
       int i=0;
       int j=n-1;
       for (int k=n-1;k>=0;k--){
           if(Math.abs(arr[i])>Math.abs(arr[j])){
               result[k]=arr[i]*arr[i];
               i++;
           }
           else {
               result[k]=arr[j]*arr[j];
               j--;
           }
       }
       return result;
    }
}
