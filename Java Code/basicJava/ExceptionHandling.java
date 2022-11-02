package basicJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		try {
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		int div= div(num1,num2);
		System.out.println("Division value: "+div);
		
		//explicitly throw an exception
		throw new IndexOutOfBoundsException("Manually thrown exception");
		}catch(ArithmeticException e)
		{
			System.out.println("Inside ArithmeticException catch block");
		}catch(InputMismatchException e)
		{
			System.out.println("Inside InputMismatchException catch block");
		}catch(Exception e)
		{
			System.out.println("Inside exception catch block");
			System.out.println(e);
		}finally {
			System.out.println("Inside finally");
		}
	
		System.out.println("End of program");
	}
	
	public static int div(int a,int b) throws ArithmeticException
	{
		int div=a/b;
		return div;
	}
}
