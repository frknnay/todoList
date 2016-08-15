package apps.lyk.todo;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		TodoHelper tHelper = new TodoHelper();
		while (!input.equals("0")) {
			Menu.printMenu(tHelper);
			input = scanner.nextLine();
			operation(input, tHelper);

		}
	}

	public static void operation(String command, TodoHelper todoHelper) {
		String[] commands = command.split(",");
		int action = Integer.parseInt(commands[0]);
		String param = commands[1];
		switch (action) {
		case 0:
			System.out.println("Exiting...");
			break;
		case 1:
			todoHelper.add(param);
			break;
		case 2:
			todoHelper.mark(Integer.parseInt(param));
			break;
		case 3:
			todoHelper.remove(Integer.parseInt(param));
			break;
		default:
			System.out.println("Please choose a number between 0-1");
			break;
		}
	}

}
