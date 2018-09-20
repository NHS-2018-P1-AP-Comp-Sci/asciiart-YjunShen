/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)


public class ASCIIArt {
	
	public static void pentaStar() {
		System.out.println("               ^     ");
		System.out.println("             /   \\   ");
		System.out.println("        ____/     \\____");
		System.out.println("        \\             /");
		System.out.println("          \\         / ");
		System.out.println("          /         \\ ");
		System.out.println("         /     ^     \\");
	}
	 
	public static void hexaStar() {
		System.out.println("            /\\     ");
		System.out.println("      _____/  \\_____");
		System.out.println("      \\            /");
		System.out.println("       >          < ");
		System.out.println("      /____    ____\\");
		System.out.println("           \\  /");
		System.out.println("            \\/");
	}
	
	public static void smallStar() {
		System.out.println("        **  *    ");
		System.out.println("          '     ");
		System.out.println("            + '  ");
		System.out.println("               -* ");
		System.out.println("                    > .");
	}
	public static void smallStar2() {
		System.out.println("                    > .");
		System.out.println("                 , ");
		System.out.println("             ..'   ");
		System.out.println("            *      ");
		System.out.println("         ;*     ");
	}
	
	public static void magician() {
		System.out.println("         | ");
		System.out.println("         | ");
		System.out.println("         | ");
		System.out.println("         |_ ");
		System.out.println("          \\\\");
		System.out.println("           \\\\ ");
		System.out.println("            \\\\ --");
		System.out.println("             ('^'  ) ");
		System.out.println("              |   \\\\");
		System.out.println("              |    \\\\");
		System.out.println("              |     \\\\");
		System.out.println("              |   |  ``");
		System.out.println("              |   |");
		System.out.println("              |   |");
		System.out.println("              | | |");
		System.out.println("              == ==");
		
	}
	
	public static void main(String[] args) {
		hexaStar();
		smallStar(); 
		pentaStar();
		smallStar2();
		hexaStar();
		smallStar();
		pentaStar();
		smallStar();
		smallStar2();
		magician();
		System.out.println("\n**++_ The stars are called out by a young and new magician. _++**");
		
	}
}