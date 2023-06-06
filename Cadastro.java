package Deposito_Saque;

import java.util.Scanner;

public class Cadastro {
	Scanner sc = new Scanner(System.in);
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = sc.nextLine();
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = Integer.parseInt(sc.nextLine());
	}

	private double DI;

	public double getDI() {
		return DI;
	}

	public void setDI() {
		this.DI = sc.nextDouble();
	}

	private double VlDepositado;

	public double getVlDepositado() {
		return VlDepositado;
	}

	public void setVlDepositado() {
		this.VlDepositado = sc.nextDouble();
	}

	private double SaqueLegal;

	public double getSaqueLegal() {
		return SaqueLegal;
	}

	public void setSaqueLegal() {
		this.SaqueLegal = sc.nextDouble();
	}

	public void Nome() {
		System.out.println("Digite o seu nome: ");
		setNome(nome);
		System.out.println("Quer fazer um depósito inicial? (y/n) ");
		String y = sc.nextLine();

		if (y.equals("y")) {
			System.out.println("Digite o valor do deposito inicial: ");
			setDI();
		}

		System.out.printf("Informações da conta " + "ID: %s, NOME: %s, DepInicial: %s", getId(), getNome(), getDI());
		System.out.println("");

	}

	public void Deposito() {
		System.out.println("Coloque o valor do depósito: ");
		setVlDepositado();
		System.out.println("Atualização da conta");
		System.out.printf("Informações da conta " + "ID: %s, NOME: %s, Saldo: %s,", getId(), getNome(),
				(getDI() + getVlDepositado()));
		System.out.println("");

	}

	public void Saque() {
		System.out.println("Coloque a quantia desejada para sacar: ");
		setSaqueLegal();
		System.out.println("Atualização da conta");
		System.out.printf("Informações da conta " + "ID: %s, NOME: %s, Saldo: %s,", getId(), getNome(),
				(getDI() + getVlDepositado() - getSaqueLegal() - 5));
	}
}
