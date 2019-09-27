import java.util.Scanner;

public class Estoque {
	String nome;
	int qtdAtual;
	int qtdMinima;
	
	Scanner sc = new Scanner(System.in);
	
	void EstoqueSem() {
		
	}
	
	void EstoqueCom(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	void mudarNome(String nome) {
		System.out.println("Digite o nome do produto: ");
		this.nome = sc.next();
	}
	
	void mudarQtdMinima(int qtdMinima) {
		do {
			System.out.println("Digite a quantidade minima: ");
			this.qtdMinima = sc.nextInt();
			if(this.qtdMinima < 0) {
				System.out.println("A quantidade minima tem que ser positiva!\n");
			}
		}while(this.qtdMinima < 0);
		
	}
	
	void repor(int qtd) {
		qtd = 0;
		
		do {
			System.out.println("Digite quanto vc quer adicionar no estoque: ");
			qtd = sc.nextInt();
			if(qtd < 0) {
				System.out.println("A quantidade tem que ser positiva!\n");
			}
		}while(qtd < 0);
		this.qtdAtual = qtdAtual + qtd;
			
	}
	
	void darBaixa(int qtd) {
		qtd = 0;
		
		do {
			System.out.println("Digite quanto vc quer remover do estoque: ");
			qtd = sc.nextInt();
			if(qtd < 0) {
				System.out.println("Tem que ser positiva!");
			}
		}while(qtd < 0 );
		this.qtdAtual = qtdAtual - qtd;
			
	}
	
	String mostra() {
		return nome+" "+qtdMinima+" "+qtdAtual;
	}
	
	Boolean precisaRepor() {
		if(qtdAtual <= qtdMinima) {
			return true;
		}else {
			return false;
		}
	}
	
}

public class UsaEstoque {

	public static void main(String[] args) {
		Estoque estoque1 = new Estoque();
		Estoque estoque2 = new Estoque();
		Estoque estoque3 = new Estoque();
		//String nome = null;
		//int qtdMinima = 0; 
		int qtd = 0;
		
		estoque1.EstoqueCom("Impressora Jato de Tinta", 13, 6);
		estoque2.EstoqueCom("Monitor LCD 17 polegadas", 11, 13);
		estoque3.EstoqueCom("Mouse Ótico", 6, 2);
		
		
		estoque1.darBaixa(qtd);
		estoque2.repor(qtd);
		estoque3.darBaixa(qtd);
		
		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
		
		
		if(estoque1.precisaRepor()) {
			System.out.println("precisa repor " + estoque1.nome);
		}else {
			System.out.println("Nao precisa repor " + estoque1.nome);
		}
		
		if(estoque2.precisaRepor()) {
			System.out.println("precisa repor " + estoque2.nome);
		}else {
			System.out.println("Nao precisa repor " + estoque2.nome);
		}
		
		
		if(estoque3.precisaRepor()) {
			System.out.println("precisa repor " + estoque3.nome);
		}else {
			System.out.println("Nao precisa repor " + estoque3.nome);
		}

	}

}
