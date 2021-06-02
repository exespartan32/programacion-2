package semana_2_3;

public class Ciudadano extends Persona{
	private String provincia;
	private long dni;
	
	public Ciudadano(String nombre, String apellido, long dni, String provincia) {
		super(nombre, apellido);
		this.provincia = provincia;
		this.dni = dni;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
}
