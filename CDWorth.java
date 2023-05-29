
import java.util.Scanner;

/**
  A program that prompts for the present value, interest rate, and number
  of years for a certificate of deposit to mature, and then prints 
  the present value. All variables should be of type double. 
*/ 

public class CDWorth
{
   public static void main (String[] args)
   {
      // Display prompt for present value 
      System.out.print("Please enter the amount to be deposited: ");

      // Read present value 
      Scanner in = new Scanner(System.in);
      double presentVal = in.nextDouble();

      // Display prompt for interest rate
      // Read rate of interest
      System.out.print("Please enter the rate of interest: ");
      double rateOfInterest = in.nextDouble();

      // Display prompt for number of years
      // Read number of years
      System.out.print("Please enter the number of years: ");
      double numberOfYears = in.nextDouble();

      // Compute and print future value
      double futureVal = presentVal * Math.pow(1+ (rateOfInterest/100),numberOfYears);
      System.out.printf("The future value is: $%.2f" ,futureVal);
      
   }
}
