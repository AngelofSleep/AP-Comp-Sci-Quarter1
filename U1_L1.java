import java.util.Scanner;
public class U1_L1
{
   public static void main(String[] args)
   {
      Scanner mae = new Scanner(System.in);
      System.out.print("Enter the edge length of the cube: ");
      int edge = mae.nextInt(); //how long each edge of the cube is
      int square = edge*edge; //area of each face of cube
      int area = 6*square; //surface area of whole cube
      System.out.println("The surface area of a cube with an edge length of " + edge + " is " + area);
   }
}