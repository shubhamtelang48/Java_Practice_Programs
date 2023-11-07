package DsaProgram;

import java.util.*;


class TwoStacks {
    static int twoStacks(int[] arr1, int[] arr2, int x) {
        return twoStacks(arr1, arr2, x, 0, 0) - 1;

    }

    private static int twoStacks(int[] arr1, int[] arr2, int x, int sum, int count) {
        if (sum > x) {
            return count;
        }
        if (arr1.length == 0 || arr2.length == 0) {
            return count;
        }
        int result1 = twoStacks((Arrays.copyOfRange(arr1, 1, arr1.length)), arr2, x, sum + arr1[0], count + 1);
        int result2 = twoStacks(arr1, (Arrays.copyOfRange(arr2, 1, arr2.length)), x, sum + arr2[0], count + 1);
        return Math.max(result1, result2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];


            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                arr2[j] = sc.nextInt();
            }
            System.out.println(twoStacks(arr1, arr2, x));
        }

    }
}

