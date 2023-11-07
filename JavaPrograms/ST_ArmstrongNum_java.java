package JavaPrograms;


public class ST_ArmstrongNum_java {

    static void ArmstrongNum(int n,int m) {
        double sum_num = 0;

        for (int i = n+1; i <= m + 1; i++) {
            int x = i;
            int y = 0;

            while (x != 0) {
                x = x / 10;
                y++;

            }

            sum_num = 0;
            x = i;
            while (x != 0) {
                int k = x % 10;
                sum_num = sum_num + Math.pow(k, y);
                x = x / 10;

            }
            if (sum_num == i)
                System.out.print(i + " ");
        }




    }
    public static void main(String[] args) {
          int n1=50;
          int n2=500;

        ArmstrongNum(n1,n2);
            System.out.println();


    }
}
