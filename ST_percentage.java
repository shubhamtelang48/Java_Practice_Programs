
import java.util.Scanner;


public class ST_percentage {
    public static void main(String[] args) {
        System.out.println("Calculating Percentage of marks");
        Scanner sc= new Scanner(System.in);
        int a,b,c,d,e;
        double percentage;

        System.out.println("enter the marks of subject 1");
        a=sc.nextInt();
        System.out.println("enter the marks of subject 2");
        b=sc.nextInt();
        System.out.println("enter the marks of subject 3");
        c=sc.nextInt();
        System.out.println("enter the marks of subject 4");
        d=sc.nextInt();
        System.out.println("enter the marks of subject 5");
        e=sc.nextInt();

        percentage=((a+b+c+d+e)/500.0)*100 ;
        System.out.print("Percentage obtained is : ");
        System.out.println(percentage);

    }
}
