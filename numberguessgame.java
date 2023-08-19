import java.util.Scanner;
import java.util.Random;

public class numberguessgame{
    public static void main(String[]args){
        Scanner guess = new Scanner(System.in);
        Random game = new Random();

        int rannum = game.nextInt(100) + 1;
        int numguess = 0;

        while(true)
        {
        System.out.print("GUESS A NUMBER BETWEEN 1 AND 100 : ");
        int num = guess.nextInt();
        numguess++;

        if(num==rannum)
        {System.out.println("CONGRATULATIONS! YOU WIN THE GAME");
            System.out.println("NUMBER OF GUESSES : " + numguess);
        break;}

        else if(num<rannum)
        {System.out.println("YOU'RE LOW, TRY AGAIN ! ");}

        else
        {System.out.println("YOU'RE HIGH, TRY AGAIN ! ");}
        }

        System.out.println("THANKS FOR PLAYING ! ");
        
        guess.close();
    
    }}