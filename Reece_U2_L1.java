public class Reece_U2_L1
{
   public static void main(String[] args)
   {
      //this lab requires Pokemon.java, which your teacher will give to you
      Pokemon a = new Pokemon();
      Pokemon b = new Pokemon("Charmander", "Fire", 10, 90);
      a.displayStats();
      b.displayStats();
      a.attack(b);
      a.displayStats();
      b.displayStats();
   }
}
