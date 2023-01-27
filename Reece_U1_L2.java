import java.util.Scanner;
public class Reece_U1_L2
{
   public static void main(String[] args)
   {
      Scanner mae = new Scanner(System.in);
      double rad,hei;//rad = radius of cone, hei=height of the cone
      System.out.print("Enter the radius of the cone: ");
      rad = mae.nextDouble();
      System.out.print("Enter the height of the cone: ");
      hei = mae.nextDouble();
      double pi = Math.PI; //pi = value of pi. You could also just type Math.PI evertime you need to use pi
      double srad = Math.pow(rad,2);
      double shei = Math.pow(hei,2);
      double dia = rad * 2; //diameter
      double cir = (rad * 2) * pi;//circumferance
      double preroot = srad + shei;
      double root = Math.sqrt(preroot);
      double are = (rad + root) * pi * rad; //surface area
      double third = 1.0/3.0;
      double vol = third * pi * srad * hei; //volume
      System.out.print("The diameter is " + dia + ", the circumference is " + cir + ", the surface area is " + are + ", and the volume is " + vol + ".");
      //looking back, this is way too many doubles
   }
}
