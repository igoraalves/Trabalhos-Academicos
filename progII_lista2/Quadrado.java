package andre.uespi.prp.br;

public class Quadrado {
	Double lado;
	
	void construtor(Double tLado) {
		this.lado = tLado;
	}
	
	Double area() {
		return (lado * lado);
	}
	
	Double perimetro(){
		return (4 * lado);
	}
	
}


public class UsaQuadrado {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		
		q1.construtor(2.0);
		q2.construtor(4.0);
		q3.construtor(5.0);
		
		System.out.println("area do q1: " + q1.area());
		System.out.println("perimetro do q1: " + q1.perimetro());
		System.out.println("area do q2: " + q2.area());
		System.out.println("perimetro do q2: " + q2.perimetro());
		System.out.println("area do q3: " + q3.area());
		System.out.println("perimetro do q3: " + q3.perimetro());

	}

}