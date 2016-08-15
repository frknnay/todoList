package apps.lyk.todo;

import java.util.ArrayList;
import java.util.Collection;

public class Todo {

	private String description;
	private boolean checked;
	
	public Todo(String description){
		this.description = description;
		this.checked = false;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
}
