package myanimals;

public class Dog extends Animal {
	private static int dogCount = 0;
	
	@Override public void makeNoise() {
		System.out.println("Woof");
	}
	
	public Dog() {
		dogCount++;
	}
	
	public static int getDogCount() {
		return dogCount;
	}
}
