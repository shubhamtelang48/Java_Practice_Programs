import java.util.Scanner;


public class ST_user_input {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a + b * b ;
        System.out.println(sum);

    }
}
