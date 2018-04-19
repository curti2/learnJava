import java.util.Scanner;

public class Excerise12 {
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	
		System.out.print("Type your name: ");
		String name1 = reader.nextLine();
		
		System.out.print("Type your age: ");
		int age1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type your name: ");
		String name2 = reader.nextLine();
		
		System.out.print("Type your age: ");
		int age2 = Integer.parseInt(reader.nextLine());
		
		int agesum = age1 + age2;
		
		System.out.println(name1 + " and " + name2 + " are " + agesum + " years old in total.");
	}
}