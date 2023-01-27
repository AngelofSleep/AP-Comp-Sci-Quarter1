import java.util.Scanner;
public class Reece_U1_L2
{
   public static void main(String[] args)
   {
      Scanner mae = new Scanner(System.in);
      double rad,hei;
      System.out.print("Enter the radius of the cone: ");
      rad = mae.nextDouble();
      System.out.print("Enter the height of the cone: ");
      hei = mae.nextDouble();
      double pi = Math.PI;
      double srad = Math.pow(rad,2);
      double shei = Math.pow(hei,2);
      double dia = rad * 2;
      double cir = (rad * 2) * pi;
      double preroot = srad + shei;
      double root = Math.sqrt(preroot);
      double are = (rad + root) * pi * rad;
      double third = 1.0/3.0;
      double vol = third * pi * srad * hei;
      System.out.print("The diameter is " + dia + ", the circumference is " + cir + ", the surface area is " + are + ", and the volume is " + vol + ".");
   }
}