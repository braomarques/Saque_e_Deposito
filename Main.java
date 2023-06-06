package Deposito_Saque;

public class Main {

	public static void main(String[] args) {
		Cadastro c = new Cadastro();
		
		System.out.println("Digite o seu ID: ");
		c.setId();
		c.Nome();
		c.Deposito();
		c.Saque();
	}

}
