package stack;

import java.util.Scanner;

public class StackMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the stack: ");
		int n=sc.nextInt();
		Stack st= new Stack(n);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element: ");
			int num=sc.nextInt();
			st.push(num);
		}
		System.out.println();
		st.printStack();
		
		st.pop();
		st.printStack();
		
		st.pop();
		st.printStack();
		
		System.out.println("Top element: "+st.peek());
	}
}
