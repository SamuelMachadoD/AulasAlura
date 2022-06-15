public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
		System.out.println("");
	}
	
	public static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
		metodo2();
		
		}catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		System.out.println("Fim do metodo1");
	}
	
	public static void metodo2() throws MinhaExcecao {
		System.out.println("ini do metodo2");
		throw new MinhaExcecao("Deu ruim");
		
		/*for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("Fim do metodo2");*/
	}
}
