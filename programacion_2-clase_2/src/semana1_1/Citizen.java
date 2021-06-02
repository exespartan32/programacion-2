package semana1_1;

public class Citizen extends Person {	
	private String province;
	private int dni;
	
	public Citizen(String name, String surname, String province, int dni) {
		super(name, surname);
		this.dni = dni;
		this.province = province;
	}	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "\n nombre: "+getName()+"\n apellido: "+getSurname()+"\n provincia: "+
				province+"\n dni: "+dni;
	}
}
