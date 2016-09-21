import java.util.Scanner;

public class AvgOfThree
{
   public static void main (String[] args)
   {
       /*
        * A Scanner parses primitive types and strings from a stream
        * 
        *       stream: a sequence of characters (from file, String, keyboard)
        *       parsing: separating a sequence of characters into tokens based on
        *                   delimiters (e.g., whitespace)
        *       
        *       When we construct a Scanner object, we specify the input stream
        *           (e.g., System.in)
        */
       Scanner s = new Scanner(System.in);
       double a, b, c;

       /*
        * NB: Due to a bug in BlueJ, you must print to the terminal before you
        *       can read from it!
        */
      System.out.print ("Enter the first number: ");
      
      /*
       * There are several methods to get tokens from a Scanner object.
       *    For example, nextDouble returns a double value
       *        nextInt returns an int value
       *        next return the next token as a String
       *    If the next token cannot be returned as an int or double, an
       *        excpetion is generated.
       *    
       *    We can advance the scanner past the current line and return
       *        everything that was skipped with the nextLine method
       */
      a = s.nextDouble();

      System.out.print ("Enter the second number: ");
      b = s.nextDouble();

      System.out.print ("Enter the third number: ");
      c = s.nextDouble();

      // compute the average of the three numbers

      double avg = (a + b + c) / 3;
      
      System.out.println ("average " + avg);
   }
}
