class Conta {
	double saldo;
	int conta;
	int agencia;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
