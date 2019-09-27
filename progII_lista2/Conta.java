public class Conta {
	String titular, agencia, DataAbertura;
	int numero;
	double saldo;

	double sacar(double valor) {
		saldo = saldo - valor;
		return saldo;
	}

	double deposita(double valor) {
		saldo = saldo + valor;
		return saldo;
	}

	double CalculaRendimento() {
		saldo = saldo * 0.1;
		return saldo;
	}

	String recuperaDadosParaImpressao() {
		return titular + " " + agencia + " " + numero + " " + DataAbertura + " " + saldo;
	}

}

public class UsaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular="Juão";
		c1.agencia="0990";
		c1.numero= 9898976;
		c1.DataAbertura="02/02/2022";
		c1.saldo=1054;
		System.out.println(c1.recuperaDadosParaImpressao());

	}

}
