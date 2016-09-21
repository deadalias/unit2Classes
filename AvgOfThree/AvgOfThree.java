import java.util.Scanner;

public class AvgOfThree
{
   public static void main (String[] args)
   {
       /*
        * Scanner parses primitive types and Strings from a stream.
        * 
        *       Stream: a sequence of characters (from a file, String, keyboard, network)
        *       Parsing: separating a sequence of characters into tokens based on
        *                   delimiters
        *       Tokens: are analogous to words
        *       Delimiters: are characters that separate tokens (e.g., whitespace)
        *       
        *  The default delimeter is whitespace.
        *  
        *  When we create a Scanner object, we have to specify the input stream
        *       (e.g., System.in is the stream for the keyboard via the terminal window)
        */
       Scanner s = new Scanner(System.in);
       double a, b, c;
       
       /*
        * NB: There is a bug in BlueJ. You must print to the terminal window before
        *       you can read from the keyboard.
        */
       System.out.print ("Enter the first number: ");
       
       /*
        * The nextDouble method attempts to convert the next token in the stream
        *   to a double and returns that double value. If the next token cannot
        *   be converted, an exception is generated.
        *   (The nextInt method works the same way.)
        */
       a = s.nextDouble();

      System.out.print ("Enter the second number: ");
      b = s.nextDouble();

      System.out.print ("Enter the third number: ");
      c = s.nextDouble();

      // compute the average of the three numbers

      double avg = (a + b + c) / 3;
      
      System.out.println ("average " + avg);
      
      /*
       * Best practice for prompting user input:
       *    Use print instead of println
       *    Leave a space after the final colon
       */
      System.out.print ("Enter your first name: ");
      
      /*
       * The next method returns the next token as a String.
       */
      String firstName = s.next();
      s.nextLine();
      
      System.out.print ("Enter your street address: ");
      
      /*
       * The nextLine method returns everything in the stream up to the end of
       *    the line. (Advances the scanner past the current line.)
       */
      String address = s.nextLine();
   }
}
