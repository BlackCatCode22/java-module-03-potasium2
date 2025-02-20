package myanimals;

public class Animal {
	private static int animalCount = 0;
	String name;
	int age;
	
	public void makeNoise() {
		System.out.println("Grr");
	}
	
	public Animal() {
		animalCount++;
	}
	
	public static int getAnimalCount() {
		return animalCount;
	}
}
