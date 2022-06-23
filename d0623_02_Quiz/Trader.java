package d0623_02_Quiz;

import java.util.Objects;

public class Trader {
	private String name;
	private String city;
	
	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 31 + (name == null ? 0 : name.hashCode());
		hash = hash * 31 + (city == null ? 0 : city.hashCode());
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Trader))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trader other = (Trader) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name);
	}
	
}
