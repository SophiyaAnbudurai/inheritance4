package inheritances;

public class LavaDino {
	protected String species;
	public LavaDino(String species) {
	super();
	this.species = species;
	}
	public String getLavaDinoName() {
	return species;
	}
	public void setLavaDinoName(String species) {
	this.species = species;
	}
}
