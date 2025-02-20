package myanimals;

public class Main {
	public static void main(String[] args) {
		System.out.println(Cat.getCatCount());
		
		Cat myCat = new Cat();
		myCat.name = "Liberty";
		myCat.age = 8;
		myCat.makeNoise();
		
		System.out.println(Cat.getAnimalCount());
		
		Dog myDog = new Dog();
		myDog.name = "Sara";
		myDog.age = 15;
		myDog.makeNoise();
		
		System.out.println(Cat.getAnimalCount());
	}
}
