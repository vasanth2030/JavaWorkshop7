package basicJava;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		//counter variable
		int i=1;
		
		while(i<=n)
		{
			//body of loop
			System.out.println("While: Hello World "+i);
			//updation
			i++;
		}
		
		System.out.println();
		System.out.println();
		
		i=1;
		do {
			System.out.println("Do while: Hello World "+i);
			i++;
		}while(i<=n);
		
		System.out.println();
		System.out.println();

		for(i=1;i<=n;i++)
		{
			System.out.println("For: Hello World "+i);
		}
		
		System.out.println("End of program");
	}
}
