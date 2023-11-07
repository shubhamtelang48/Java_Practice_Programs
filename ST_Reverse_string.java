

public class ST_Reverse_string {

    //@Override
    public static String reverse_str(String n) {
        String result="";
        int len=n.length();

        for(int i=len-1; i>=0; i--){
            result = result + n.charAt(i);

        }
        return result;
    }

    public static int reverse_num(int num) {
        int result=0;

        while(num>0){
            result= result*10 + num%10;
            num=num/10;

        }
        return result;

    }

    public static void main(String[] args) {
        String str="SHUBHAM";
        String rev="";
        int len=str.length();

        for(int i=len-1; i>=0; i--){
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);
        System.out.println(reverse_str("ABCDEFGH"));
        System.out.println(reverse_num(12345));
    }
}
