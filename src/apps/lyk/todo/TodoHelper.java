package apps.lyk.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoHelper {

	private List<Todo> todos = new ArrayList<>();

	public void add(String description) {
		todos.add(new Todo(description));
	}

	public void mark(int todoIndex) {
		if (todos.get(todoIndex - 1).isChecked()) {
			todos.get(todoIndex - 1).setChecked(false);
		} else
			todos.get(todoIndex - 1).setChecked(true);
	}

	public void remove(int todoIndex) {
		todos.remove(todoIndex - 1);
	}

	public String getTodos() {
		StringBuilder listOfTodos = new StringBuilder();
		int counter = 1;
		for (Todo item : todos) {
			listOfTodos.append(counter + " - " + getStatusCharacter(item) + " " + item.getDescription() + "\n");
			counter++;
		}
		return listOfTodos.toString();
	}

	public String getStatusCharacter(Todo todo) {
		if (todo.isChecked())
			return "☑";
		else
			return "☐";
	}

}
