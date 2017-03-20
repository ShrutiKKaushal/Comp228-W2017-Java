package week10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling  {
	
	public static int quotient(int numerator, int denominator)
			throws ArithmeticException
	   {
	      return numerator / denominator; // possible division by zero
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 boolean continueLoop = true;
		 
		 do
		 {
			try {
				System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();
	            System.out.print("Please enter an integer denominator: ");
	            int denominator = scanner.nextInt();

	            int result = quotient(numerator, denominator);
	            System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
	           
	            continueLoop = false; // input successful; end looping
			 }
			catch (InputMismatchException inputMismatchException)
	         {
	            System.err.printf("%nException: %s%n", inputMismatchException);
	            scanner.nextLine(); // discard input so user can try again
	            System.out.printf(
	               "You must enter integers. Please try again.%n%n");
	         }
			catch(ArithmeticException e){
				System.err.printf("%n Exception: %s%n", e);
				System.out.printf("Zero is an invalid denominator, Please try again");
				
			}
		 }while(continueLoop);

	}

}
