package apps.lyk.todo;

public class Menu {

	public static void printMenu(TodoHelper todoHelper) {

		Todo[] todosToPrint = todoHelper.getTodos();
		StringBuilder menu = new StringBuilder();
		menu.append("Todos\n");
		menu.append("========\n");
		for (int i = 0; i < todosToPrint.length; i++) {
			menu.append(i+1);
			menu.append(" - ");
			menu.append(todoHelper.getStatusCharacter(todosToPrint[i]));
			menu.append(" ");
			menu.append(todosToPrint[i].getDescription());
			menu.append("\n");
		}
		menu.append("Menu\n");
		menu.append("========\n");
		menu.append("0 - Exit\n");
		menu.append("1 - Add todo\n");
		menu.append("2 - Mark as checked\n");
		menu.append("3 - Remove todo\n");
		System.out.println(menu);
	}

}
