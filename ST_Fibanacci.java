import java.util.Scanner;

public class ST_Fibanacci {


    static int fib(int n){
        if (n == 1) {
            return 0;
        } else if (n == 2){
            return 1;
        } else{
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nth number :");
        int n=sc.nextInt();
        int result=fib(n);
        System.out.println(result);





    }
}
