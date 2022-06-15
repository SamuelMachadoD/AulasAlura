public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		System.out.println("primeiraConta : " + primeiraConta);
		System.out.println("segundaConta : " + segundaConta);
		//são os codigos de referencia de cada varaivel
		//se igualalos(primeiraConta = segundaConta) apenas apontara para a mesma conta, qualquer mudança feita em ambas as variaveis vai alterar a MESMA conta.
		
	}
}
