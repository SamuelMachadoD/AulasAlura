import java.io.Serializable;

abstract class Conta implements Serializable{
	protected double saldo;
	private int conta;
	private int agencia;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int conta) {
		//isso é um construtor, o codigo cria esse objeto de acordo com as coisas presentes aqui
		this.conta = conta;
		this.saldo = 0;
		total++;
	}
	//privar atributos é melhor para implementações internas de cada atributo já dentro da classe

	public abstract void deposita(double valor);

	public void sacar(double valor) {
		if (saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
		
	}

	public void transferir(double valor, Conta destino){
			this.sacar(valor);
			destino.deposita(valor);
	}
	
	//Getter - retorna o mesmo tipo da variavel, não recebe nada
	public double getSaldo() {
		return this.saldo;
	}
	//Setter - não retorna nada( normalmente ), recebe o mesmo tipo da variavel
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getotal() {
		return Conta.total;
	}
}
