package polimorfismo;

public class Programa {

	public static void main(String[] args) {
		Ave ave = new Ave(33.0, 33.0, 33.0, 50.0);
		
		AguiaAmericana aguiaAmericana = new AguiaAmericana(33.0, 33.0, 33.0, 50.0, 9.0);
		
		ave.voar();
		aguiaAmericana.voar();
		
		
		
	}
	
}
