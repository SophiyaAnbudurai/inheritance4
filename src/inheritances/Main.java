package inheritances;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("1. Land Dino \n 2. Aqua Dino \n 3. Aerial Dino");

		System.out.println("Enter choice: ");
		int n = in.nextInt();
		switch(n)
		{
		case 1 :

		System.out.println("Enter species: ");
		String species = in.next();
		System.out.println("Enter type: ");
		String locomotiontype = in.next();
		System.out.println("Enter speed: ");
		int speed = in.nextInt();
		System.out.println("Enter no.of feets: ");
		int feet = in.nextInt();
		LandLavaDino land = new LandLavaDino(species,speed,feet,locomotiontype);
		land.display();
		
	    case 2:
		System.out.println("Enter Species:");
		String species1=in.next();
		System.out.println("Enter Type:");
		String locomotionType1=in.next();
		System.out.println("Enter Speed:");
		int speed1=in.nextInt();
		System.out.println("Enter no.of fins:");
		int numberOfFins=in.nextInt();
		System.out.println("Enter no.of tails:");
		float numberOfTails=in.nextFloat();
		System.out.println("Enter lava multiplier:");
		float lavaMultiplier=in.nextFloat();
		WaterLavaDino wld=new WaterLavaDino(species1,locomotionType1,speed1,numberOfFins,numberOfTails,lavaMultiplier);
		wld.displayDinoSpeed();
		break;
		case 3:
		System.out.println("Enter Species:");
		String species2=in.next();
		System.out.println("Enter Type:");
		String locomotionType2=in.next();
		System.out.println("Enter Speed:");
		int speed2=in.nextInt();
		System.out.println("Enter no.of wings:");
		int numberOfWings=in.nextInt();
		System.out.println("Enter speed/wings:");
		float speedPerWing=in.nextFloat();
		System.out.println("Enter ash resistance:");
		float ashResistance=in.nextFloat();
		AirLavaDino ald=new AirLavaDino(species2,locomotionType2,speed2,numberOfWings,speedPerWing,ashResistance);
		ald.displayDinoSpeed();
		break;
		default : System.out.println("Invalid Choice");
		break;
	}
}
	
}

