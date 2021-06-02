package semana3;

public class Contact {
	private String name;
	private String email;
	private String mobil;
	private boolean topList;

	public Contact(String name, String email, String mobil, boolean topList) {
		super();
		this.name = name;
		this.email = email;
		this.mobil = mobil;
		this.topList = topList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobil() {
		return mobil;
	}
	public void setMobil(String mobil) {
		this.mobil = mobil;
	}
	public boolean isTopList() {
		return topList;
	}
	public void setTopList(boolean topList) {
		this.topList = topList;
	}
	@Override
	public String toString() {
		return "\n nombre: "+name+"\n email: "+email+"\n numero de telefono: "+mobil+
				"\n ¿pertenece a la top list? "+topList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((mobil == null) ? 0 : mobil.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (topList ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mobil == null) {
			if (other.mobil != null)
				return false;
		} else if (!mobil.equals(other.mobil))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (topList != other.topList)
			return false;
		return true;
	}
	
	
	
}
