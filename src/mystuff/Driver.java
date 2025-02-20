package mystuff;

public class Driver {
	public static void main(String[] args) {
		Game myGame = new Game();
		myGame.title = "Balatro";
		myGame.developer = "LocalThunk";
		myGame.releaseYear = 2024;
		myGame.genre = "Rougelike";
		myGame.price = 14.99;
		myGame.downloadSize = 63;
		myGame.rating = 9.6;
		
		Game myGame2 = new Game();
		myGame2.title = "Okami";
		myGame2.developer = "Capcom";
		myGame2.releaseYear = 2006;
		myGame2.genre = "Action-Adventure";
		myGame2.price = 19.99;
		myGame2.downloadSize = 26640;
		myGame2.rating = 9.4;
		
		System.out.println(myGame.title);
		System.out.println(myGame2.title);
	}
}
