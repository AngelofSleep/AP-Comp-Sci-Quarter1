import java.util.Scanner;
public class Reece_P8_U3_L2
{
   public static void main(String[] args)
   {
      //program that compares four given digits to a randomly generated four-digit code
      Scanner mae = new Scanner(System.in);
      //generating code. no duplicate numbers allowed!
      String i,j,k,l; //here from line 21 was added last, so that is why the variable start at e, and a doesn't pop up till line 22
      int e = (int)(10*Math.random());
      int f = (int)(10*Math.random());
      while(f == e)
         f =(int)(10*Math.random());
      int g = (int)(10*Math.random());
      while(g == e || g == f)
         g = (int)(10*Math.random());
      int h = (int)(10*Math.random());
      while(h == e || h == f || h == g)
         h = (int)(10*Math.random());
      i = String.valueOf(e);
      j = String.valueOf(f);
      k = String.valueOf(g);
      l = String.valueOf(h);
      String a = i+j+k+l; 
      //user enters their own code, computer compares it to randomly generated code
      String b;
      int c = 0;
      int d = 0;
      System.out.print("Enter a four digit code, do not repeat any digits: ");
      b = mae.next();
      if(b.indexOf(i) == 0)//very simple process, but requires a lot of copy paste.
         c++;
      else if(b.indexOf(i) > 0)
         d++;
      if(b.indexOf(j) == 1)
         c++;
      else if(b.indexOf(j) > 1 || b.indexOf(j) == 0)
         d++;
      if(b.indexOf(k) == 2)
         c++;
      else if(b.indexOf(k) > 2 || b.indexOf(k) == 0 || b.indexOf(k) == 1)
         d++;
      if(b.indexOf(l) == 3)
         c++;
      else if(b.indexOf(l) > 3 || (b.indexOf(l) >= 0 && b.indexOf(l) < 3))
         d++;
      System.out.print("Digits in the correct location: "+c+"\nCorrect digits in wrong location: "+d);
   }
}
