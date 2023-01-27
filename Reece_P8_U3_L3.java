import java.util.Scanner;
public class Reece_P8_U3_L3
{
   public static void main(String[] args)
   {
      Scanner mae = new Scanner(System.in);
      int temp;
      String system;
      System.out.println("Enter a temperature:");
      temp = mae.nextInt();
      System.out.println("Enter C for Celsius, F for Fahrenheit:");
      system = mae.next();
      if(system.equals("C"))
      {
         if(temp<=0)
            System.out.print("The water is solid (frozen)");
         else if(temp>0 && temp<100)
            System.out.print("The water is liquid");
         else
            System.out.print("The water is gaseous (boiling)");
      }
      if(system.equals("F"))
      {
         if(temp<=32)
            System.out.print("The water is solid (frozen)");
         else if(temp>32 && temp<212)
            System.out.print("The water is liquid");
         else
            System.out.print("The water is gaseous (boiling)");
      }
   }
}