package semana2;

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
	
	Integer i = new Integer (dni);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + dni;
		result = prime * result + ((i == null) ? 0 : i.hashCode());
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Citizen other = (Citizen) obj;
		if (dni != other.dni)
			return false;
		if (i == null) {
			if (other.i != null)
				return false;
		} else if (!i.equals(other.i))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		return true;
	}
}
