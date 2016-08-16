package apps.lyk.todo;

import java.util.Iterator;

public class Menu {

	public static void printMenu() {
		StringBuilder menu = new StringBuilder(50);
		int index = 1;
		Iterator<Todo> todos = TodoHelper.getIterator();

		menu.append("TODOs\n");
		menu.append("=====\n");
		menu.append("\n");

		while (todos.hasNext()) {
			Todo currentTodo = currentTodo = todos.next();
			menu.append("(");
			menu.append(index++);
			menu.append(") ");
			menu.append(currentTodo.getCheckbox());
			menu.append(" ");
			menu.append(currentTodo.getDescription());
			menu.append("\n");
		}

		menu.append("\n");
		menu.append("MENU\n");
		menu.append("=====\n");
		menu.append("(0) Exit\n");
		menu.append("(1) Add Todo\n");
		menu.append("(2) Mark as done\n");
		menu.append("(3) Mark as undone\n");
		menu.append("(4) Remove todo\n");
		menu.append("\n");
		menu.append("Enter your command: ");

		System.out.println(menu.toString());
	}

}
