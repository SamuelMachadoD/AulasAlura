
public class TestasCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 11;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		if (idade >= 18 || acompanhado)  { //ou || //e &&
			System.out.println("Seja bem-vindo");
		} else { 
			System.out.println("Infelizmente voce nao pode entrar");
		}
		
	}
}
