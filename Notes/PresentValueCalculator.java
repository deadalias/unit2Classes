public class PresentValueCalculator
{
   public static void main(String[] args)
   {
      double pmt = 10000; // $10,000
      double i = 0.08; // 8%
      int n = 20; // 20 years
      
      double pv = pmt * (
         ((Math.pow(1 + i, n - 1) - 1) / i) / Math.pow(1 + i, n - 1) + 1);
         
      // or
      
      double a = Math.pow(1 + i, n - 1);
      double b = (a - 1) / i;
      double c = b / a;
      double pv2 = pmt * (c + 1);
 
      System.out.println(pv);
            System.out.println(pv2);
   }
}
