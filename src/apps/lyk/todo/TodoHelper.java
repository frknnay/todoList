package apps.lyk.todo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TodoHelper {

	private static List<Todo> todos = new ArrayList<>();

	public static void add(Todo todo) {
		todos.add(todo);
	}

	public static void remove(int index) {
		Todo todo = todos.get(index);
		todos.remove(todo);
	}

	/**
	 * This method sets a Todo object's done field which is placed in the
	 * specified index of todos list
	 * 
	 * @param index
	 *            list index of the Todo object to be modified
	 * @param isDone
	 *            a boolean value which indicates whether it's done or not
	 */
	public static void mark(int index, boolean isDone) {
		Todo t = todos.get(index);
		t.setDone(isDone);
	}

	public static Iterator<Todo> getIterator() {
		return todos.iterator();
	}

	public static Collection<Todo> getTodos() {
		return todos;
	}
}
