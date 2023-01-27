import java.util.Scanner;
public class Reece_U1_L3
{
   public static void main(String[] args)
   {
      Scanner mae = new Scanner(System.in);
      double wage,hours,over,pay; //wage = hourly wage; hours = how many hours you worked; over=overtime worked; pay=how much you get paid
      System.out.print("Enter your hourly wage: ");
      wage = mae.nextDouble();
      System.out.print("Enter the total hours you worked this week (excluding overtime): ");
      hours = mae.nextDouble();
      System.out.print("Enter the total OVERTIME hours worked this week: ");
      over = mae.nextDouble();
      pay = (wage*hours) + ((1.5*wage)*over);
      System.out.println("Your total weekly pay is $" + pay + ".");
   }
}
