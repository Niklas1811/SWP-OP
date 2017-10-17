
public class test
{
   public static void main(String args[])
   {
      rekursiv(0) ;
   }

   public static void rekursiv(int a)
   {
      System.out.println("Hinweg "+ a );
      a++;
      if (a<5)
      {
         rekursiv(a);  // rekursiver Aufruf
      }
      System.out.println("Rueckweg " + a );
   }

} // end class
