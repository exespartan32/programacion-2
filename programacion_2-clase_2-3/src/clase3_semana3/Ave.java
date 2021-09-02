package clase3_semana3;

public abstract class Ave {
	private String Name;
	
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return this.Name;
	}
	public abstract String walk();
	
	public abstract String type();
	
}
