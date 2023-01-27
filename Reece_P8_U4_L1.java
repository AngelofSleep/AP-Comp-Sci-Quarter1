import java.util.Scanner;
public class Reece_P8_U4_L1
{
   //raises 2 to whatever positive power you would like
   public static void main(String[] args)
   {
      int power = 2;
      Scanner mae = new Scanner(System.in);
      System.out.print("Enter a positive power, enter -1 to stop: ");
      power = mae.nextInt();
      while(power != -1)
      {
         System.out.println("2^"+power+"="+Math.pow(2, power));
         System.out.print("Enter a positive power, enter -1 to stop: ");
         power = mae.nextInt();
      }
      System.out.print("Goodbye!");
   }
}
