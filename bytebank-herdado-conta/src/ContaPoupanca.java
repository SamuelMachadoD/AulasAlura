public class ContaPoupanca extends Conta{
	public ContaPoupanca(int conta) {
		super(conta);
		System.out.println("conta poupanca criada");
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
