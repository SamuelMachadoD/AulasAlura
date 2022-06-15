public class TestaBanco {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.titular = new Cliente(); //referencia um cliente a partir de uma conta
		contaDoPaulo.titular.nome = "Paulo";
		contaDoPaulo.titular.cpf = "222.999.999-99";
		contaDoPaulo.titular.profissao = "programador";
		
		contaDoPaulo.deposita(100);
		
		// jeito 2 : contaDoPaulo.titular = paulo; 
		// referencia um cliente a conta
		// dessa forma precisa de uma variavel para Cliente utilizando New
		System.out.println(contaDoPaulo.titular.nome);
	}
}
