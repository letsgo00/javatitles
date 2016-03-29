package tk.ckdeveloper.javatitles;

public class imgGenerator {

	public static void newImg(int p, String hp, String t, int l) {
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println("Points: " + p);
		System.out.println("Health: " + hp);
		System.out.println("Level: " + l);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		BigLetters.bigletter(t);
		
	}
	
	public static void lvlUpImg(int l) {
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		
		System.out.println("                                  LEVEL UP!");
		System.out.println("");
		System.out.println("                                New level: " + l + "!");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		
		
		
	}
	
	
}
