package apps.lyk.todo;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		Menu menu = new Menu();
		TodoHelper tHelper = new TodoHelper();
		while (!input.equals("0")) {
			menu.printMenu(tHelper);
			input = scanner.nextLine();
			operation(input, tHelper);
			
		}
	}
	public static void operation(String command,TodoHelper todoHelper){
		String[] commands = command.split(",");
		switch (Integer.parseInt(commands[0])) {
		case 1:
			todoHelper.add(commands[1]);
			break;
		case 2:
			todoHelper.mark(Integer.parseInt(commands[1]));
			break;
		case 3:
			todoHelper.remove(Integer.parseInt(commands[1]));
			break;
		default:
			break;
		}
	}
	
	
}
