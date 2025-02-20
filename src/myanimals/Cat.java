package myanimals;

public class Cat extends Animal {
	private static int catCount = 0;
	int livesRemaining;
	
	@Override public void makeNoise() {
		System.out.println("Meow");
	}
	
	public Cat() {
		catCount++;
	}
	
	public static int getCatCount() {
		return catCount;
	}
}
