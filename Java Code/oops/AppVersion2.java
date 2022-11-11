package oops;

public abstract class AppVersion2 extends AppVersion1{
	//overriding - runtime polymorphism
	public void function1()
	{
		System.out.println("Updated: Doing function 1");
		super.function1();
	}
	
	//overloading - compile time polymorphism
	public void function1(String data)
	{
		System.out.println("Doing function "+data);
	}
	
	public void function4()
	{
		System.out.println("Doing function 4");
	}
	public void function5()
	{
		System.out.println("Doing function 5");
	}
	
	public abstract void newFunction1();
	public abstract void newFunction2();
}
