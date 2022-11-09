package oops;

public class Main {
	public static void main(String[] args) {
		String name="Dog";
		String habitat="Land";
		Animal animal1= new Animal(name,habitat);
		animal1.sleep();
		animal1.eat();
		animal1.setName("Cat");
		System.out.println("Name: "+animal1.getName());
		System.out.println("Habitat: "+animal1.getHabitat());
	}
}
