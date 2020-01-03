package inheritances;

public class LandLavaDino extends LavaDino{
	private int speed;
	private int feet;
	private String locomotiontype;
	
	
	public LandLavaDino(String species, int speed, int feet, String locomotiontype) {
		super(species);
		this.speed = speed;
		this.feet = feet;
		this.locomotiontype = locomotiontype;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getFeet() {
		return feet;
	}


	public void setFeet(int feet) {
		this.feet = feet;
	}


	public String getLocomotiontype() {
		return locomotiontype;
	}


	public void setLocomotiontype(String locomotiontype) {
		this.locomotiontype = locomotiontype;
	}
	
public void display()
{
	System.out.println("Dino Details");
	System.out.println("Species:"+species);
	int travel=this.getSpeed()*this.getFeet();
	System.out.println("Travels by land at a speed of " +travel+"km/hr");
}
}
