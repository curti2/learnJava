import java.util.Scanner;

public class Excerise10 {
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	
		System.out.print("Type the radius: ");
		int radius = Integer.parseInt(reader.nextLine());
		
		double sum = 2 * Math.PI * radius;
		
		System.out.println("Circumference of the circle: " + sum);
	
	}
}