public class TestaMetodos {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.deposita(500);
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		System.out.println("conta 1 tem " + conta1.saldo);
		System.out.println("conta 2 tem " + conta2.saldo);
		conta1.sacar(250);
		System.out.println("conta 1 tem " + conta1.saldo);
		conta2.transferir(250, conta1);
		System.out.println("conta 1 tem " + conta1.saldo);
		System.out.println("conta 2 tem " + conta2.saldo);
	}
}
