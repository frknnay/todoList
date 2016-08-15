package apps.lyk.todo;

public class Menu {

	public static void printMenu(TodoHelper todoHelper) {

		StringBuilder menu = new StringBuilder();
		menu.append("Todos\n");
		menu.append("========\n");
		menu.append(todoHelper.getTodos());
		menu.append("Menu\n");
		menu.append("========\n");
		menu.append("0 - Exit\n");
		menu.append("1 - Add todo\n");
		menu.append("2 - Mark as checked\n");
		menu.append("3 - Remove todo\n");
		System.out.println(menu);
	}

}
