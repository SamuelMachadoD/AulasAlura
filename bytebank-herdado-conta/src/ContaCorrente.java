public class ContaCorrente extends Conta implements Tributavel{

	
	public ContaCorrente(int conta) {
		super(conta);
		System.out.println("conta corrente criada");
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor + 0.2);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
