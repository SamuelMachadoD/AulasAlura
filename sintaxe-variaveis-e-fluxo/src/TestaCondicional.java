
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 11;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voce e maior de idade");
			System.out.println("Seja bem-vindo");
		} else { 
			if(quantidadePessoas >= 2) {
				System.out.println("Voce e de menor mas esta acompanhado");
				System.out.println("Bem-vindo");
			} else {
			System.out.println("Infelizmente voce nao pode entrar");
			}
		}
	}
}
