
public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123);
		try {
			conta.deposita(200);
			conta.sacar(400);
		}catch(SaldoInsuficienteException ex){
			System.out.println("Dinheiro insuficiente");
		}
		
		System.out.println(conta.getSaldo());
	}
}
