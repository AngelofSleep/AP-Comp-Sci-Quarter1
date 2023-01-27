import java.util.Scanner;
public class Reece_P8_U4_L2
{
   public static void main(String[] args)
   {
      Scanner mae = new Scanner(System.in);
      int maesnumber = (int)(100*Math.random())+1;
      int guess;
      int numberofguesses = 0;
      System.out.println("I'm thinking of a number between 1 and 100:\nYour guess?");
      guess = mae.nextInt();
      numberofguesses++;
      while(guess != maesnumber)
      {
         while(guess < 1 || guess > 100)
         {
            System.out.println("Please enter a number in range:\nYour guess?");
            guess = mae.nextInt();
         }
         if(guess > maesnumber)
            System.out.println("Incorrect - guess a smaller number\nYour guess?");
         if(guess < maesnumber)
            System.out.println("Incorrect - guess a larger number\nYour guess?");
         guess = mae.nextInt();
         numberofguesses++;
      }
      System.out.println("Correct! It took you "+numberofguesses+" tries!");    
   }
}