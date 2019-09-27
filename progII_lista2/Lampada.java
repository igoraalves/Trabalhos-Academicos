spackage andre.uespi.prp.br;

public class Lampada {
	Boolean ligada;
	
	void liga() {
		ligada = true;
	}
	
	void desliga() {
		ligada = false;
	}
	
	String observa() {
		if(ligada == true) {
			return "ligada";
		}else {
			return "desligada";
		}
	}

}

public class UsaLampada {

	public static void main(String[] args) {
		Lampada lampa1 = new Lampada();
		Lampada lampa2 = new Lampada();
		
		lampa1.liga();
		lampa2.desliga();
		
		System.out.println("lampa1 " + lampa1.observa());
		System.out.println("lampa2 " + lampa2.observa());
		
	}

}