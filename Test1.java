	
class Test1{
	public static void main(String[] args) {
		System.out.println("hallo");
		Leerling deLeerling = new Leerling("Henk");
		System.out.println(deLeerling.naam);
		deLeerling.maken();
		System.out.println("Je hebt een " + deLeerling.tentamen.cijfer);
		if (deLeerling.tentamen.cijfer <= 6) {
			System.out.println("Onvoldoende, je moet herkansen");
		} else if(deLeerling.tentamen.cijfer >= 6) 
			System.out.println("Voldoende, gefeliciteerd!");{
		}
	}
}
class Leerling{
	String naam;
	Tentamen tentamen = new Tentamen();
	Leerling (String deNaam){
		naam = deNaam;
	}
	void maken() {
		Cijfer cijfer = new Cijfer(5);
		tentamen.cijfer += cijfer.tentamenMaken;
	
	}
class Tentamen{
	int cijfer;
}

class Cijfer{
	int tentamenMaken;
	Cijfer(int cijfer){
	tentamenMaken = cijfer;
	boolean onvoldoende;
	onvoldoende = true;
	}
	
	
	
}
}


		 
		 
		

