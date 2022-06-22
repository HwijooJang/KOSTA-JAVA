package d0622_01_Stream1;

public class Country {
	private String name;
	private Continent continent;
	private int population;
	private boolean oecd;
	
	public Country(String name, Continent continent, int population, boolean oecd) {
		this.name = name;
		this.continent = continent;
		this.population = population;
		this.oecd = oecd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public boolean isOecd() {
		return oecd;
	}

	public void setOecd(boolean oecd) {
		this.oecd = oecd;
	}

	@Override
	public String toString() {
		return name + " in " + continent + " : " + population + " (OECD : " + oecd + ")";
	} 

    	

}
