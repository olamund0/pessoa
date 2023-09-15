

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	private int CPF;

	static ArrayList<Pessoa> listaDeAmigos = new ArrayList<Pessoa>();

	public Pessoa(String nome, int idade, int CPF) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
	}

	public static void main(String[] args) {
		Pessoa amigo = new Pessoa();
		amigo.nome = "José";
		amigo.idade = 22;
		amigo.CPF = 8889;

		amigo.adicionarAmigo(amigo);

		Pessoa segundoAmigo = new Pessoa();
		segundoAmigo.nome = "Maria";
		segundoAmigo.idade = 25;
		segundoAmigo.CPF = 8879;

		verificarCPF(segundoAmigo, segundoAmigo.CPF);

		// nao adicionei na lista para usar metodo ehAmigoDe
		Pessoa terceiroAmigo = new Pessoa();
		terceiroAmigo.nome = "Pedro";
		terceiroAmigo.idade = 26;
		terceiroAmigo.CPF = 8879;
		
		verificarCPF(terceiroAmigo, terceiroAmigo.CPF);
		
		printar();

		amigo.envelhecer(2);
		System.out.println("Nova idade: ");

		printarIdade(amigo);

		System.out.printf("%s é amigo de %s? " + amigo.ehAmigoDe(segundoAmigo), amigo.nome, segundoAmigo.nome);
		System.out.printf("\n%s é amigo de %s? " + amigo.ehAmigoDe(terceiroAmigo), amigo.nome, terceiroAmigo.nome);
		System.out.printf("\n%s é amigo de %s? " + segundoAmigo.ehAmigoDe(terceiroAmigo), segundoAmigo.nome, terceiroAmigo.nome);
		System.out.printf("\n%s é amigo de %s? " + segundoAmigo.ehAmigoDe(amigo), segundoAmigo.nome, amigo.nome);
		
	}

	public void adicionarAmigo(Pessoa amigo) {
		listaDeAmigos.add(amigo);
	}

	public void envelhecer(int novaIdade) {
		if (novaIdade >= 0) {
			idade += novaIdade;
		}
	}

	public static void printar() {
		for (Pessoa amigo : listaDeAmigos) {
			System.out.println("Nome: " + amigo.nome);
			System.out.println("Idade: " + amigo.idade);
			System.out.println("CPF: " + amigo.CPF);
			System.out.println("");
		}
	}

	public static void printarIdade(Pessoa amigo) {
		System.out.println("Nome: " + amigo.nome);
		System.out.println("Idade: " + amigo.idade);
		System.out.println("CPF: " + amigo.CPF);
		System.out.println("");
	}

	public Pessoa() {

	}

	public boolean ehAmigoDe(Pessoa outraPessoa) {
		return listaDeAmigos.contains(outraPessoa);
	}

	public boolean temCPFRepetido(int cpf) {
		for (Pessoa pessoa : listaDeAmigos) {
			if (pessoa.CPF == cpf) {
				return true;
			}
		}
		return false;
	}

	public static void verificarCPF(Pessoa amigo, int cpf) {
		if (amigo.temCPFRepetido(cpf)) {

			System.out.printf("O amigo %s está repetido", amigo.nome);
			System.out.println("\n");

		} else {
			amigo.adicionarAmigo(amigo);

		}
	}
}