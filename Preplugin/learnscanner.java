import java.util.Scanner;

public class learnscanner {
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Your name please: ");
		String name = reader.nextLine();
		
		System.out.print("How old are you: ");
		int number = Integer.parseInt(reader.nextLine());
		
		System.out.println("Your name is " + name + " and you are " + number + " years old.");
	}
}