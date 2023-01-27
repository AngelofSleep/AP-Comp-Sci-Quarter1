import java.util.Scanner;
public class Reece_P8_U3_L1
{
   public static void main(String[] args)
   {
      Scanner mae = new Scanner(System.in);
      int a,b,c,d; //My ints are named like this because its easy to keep track and doesn't take a lot of typing
      System.out.print("Enter the first integer: ");
      a = mae.nextInt();
      System.out.print("Enter the second integer: ");
      b = mae.nextInt();
      if(a >= b)
      {
         c = a/b;
         d = a%b;
         System.out.print("The quotient of "+a+" divided by "+b+" is "+c+", with a remainder of "+d+".");
      }
      else
      {
         c = b/a; //this code is the exact same as in the if statement but a and b are swapped
         d = b%a;
         System.out.print("The quotient of "+b+" divided by "+a+" is "+c+", with a remainder of "+d+".");
      }
   }
}