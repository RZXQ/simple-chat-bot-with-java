package stage_2;

import java.util.Scanner;

public class SimpleBot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello! My name is Aid.");
		System.out.println("I was created in 2024.");
		System.out.println("Please, remind me your name.");

		// reading a name
		String name = scanner.nextLine();

		System.out.printf("What a great name you have, %s!", name);
	}

}
