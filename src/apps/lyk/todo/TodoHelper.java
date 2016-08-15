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

	public void remove(int inputMenuIndex) {
		todos.remove(inputMenuIndex - 1);
	}

	public Todo[] getTodos() {
		Todo[] todosToIterate = new Todo[todos.size()];
		int counter = 0;

		for (Todo item : todos) {
			todosToIterate[counter] = item;
			counter++;
		}
		return todosToIterate;
	}

	public String getStatusCharacter(Todo todo) {
		if (todo.isChecked())
			return "☑";
		else
			return "☐";
	}

}
