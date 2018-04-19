import java.util.Scanner;

public class Excerise8 {
	public static void main(String[] args) {
	Scanner imp = new Scanner(System.in);
	
	System.out.print("Type a number: ");
	int num1 = Integer.parseInt(imp.nextLine());
	
	System.out.print("Type another number: ");
	int num2 = Integer.parseInt(imp.nextLine());
	
	int sum = num1 + num2;
	
	System.out.println("Sum of the numbers: " + sum);
	}
}