package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//		if condition
//		System.out.println("Enter your age: ");
//		int age=sc.nextInt();	
//		if(age==21)
//		{
//			System.out.println("Congratulations! You are eligible for a free vacation plan");
//		}
		
//		if else condition
//		System.out.println("Enter a number: ");
//		int n=sc.nextInt();
//		if(n%2==0)
//		{
//			System.out.println("Even number");
//		}
//		else {
//			System.out.println("Odd number");
//		}
		
//		if...else if...else ladder
		System.out.println("Enter your marks: ");
		int marks= sc.nextInt();
		if(marks>=80)
		{
			System.out.println("Grade A");
		}
		else if(marks>=70)
		{
			System.out.println("Grade B");
		}
		else if(marks>=60)
		{
			System.out.println("Grade C");
		}
		else if(marks>=50)
		{
			System.out.println("Grade D");
		}
		else if(marks>=40)
		{
			System.out.println("Grade E");
		}
		else {
			System.out.println("Fail");
		}

		System.out.println("End of program");
		
	}

}
