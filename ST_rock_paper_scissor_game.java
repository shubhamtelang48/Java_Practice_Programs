import java.util.Random;
import java.util.Scanner;

public class ST_rock_paper_scissor_game {
    public static void main(String[] args) {

        System.out.println("Enter 0 for rock: 1 for paper: 2 for scissor");
        Scanner sc= new Scanner(System.in);
        int userinput=sc.nextInt();

        Random random = new Random();
        int computerinput=random.nextInt(3);

        if(userinput==computerinput){
            System.out.println("Match Draw!");
        }
        else if (userinput==0 && computerinput==2 || userinput==1 && computerinput==0
        || userinput==2 && computerinput==1){
            System.out.println("You won the Match!");

        }
        else {
            System.out.println("You loss and Computer win");
        }
        System.out.println("computer choce ;" + computerinput);


    }
}
