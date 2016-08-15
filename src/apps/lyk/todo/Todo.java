package apps.lyk.todo;

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
