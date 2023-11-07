package JavaPrograms;

import java.util.Scanner;

public class ST_Palidrome {

    static int palidromeNum(int n){
        int num=n;
        int rev=0;
        while(num!=0){
            rev=rev*10 + num%10;
            num/=10;
        }
        if(n==rev){
            System.out.println(rev + " Number is Palidrome");
        }
        else{
            System.out.println(rev + " Number is not palidrome");
        }


        return rev;
    }

    static String palidromeStr(String s){
        String str=s;
        String rev="";
        int len= s.length();

        for(int i=len-1; i>=0; i--){
            rev=rev + str.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println(rev + " is a Palidrome String");
        }
        else{
            System.out.println(rev + " is not a Palidrome String");
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println(palidromeNum(num));


        System.out.println("Enter the String: ");
        String str=sc.next();
        System.out.println(palidromeStr(str));

    }
}
