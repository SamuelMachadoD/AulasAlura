public class TestaCodigo {
	public static void main(String[] args) {
		Conta conta = new Conta(562);
		conta.setSaldo(1000);
		System.out.println(conta.getSaldo());
		conta.setTitular(new Cliente()); //Cria Cliente ja referenciado em Conta, a partir de get e set
		conta.getTitular().setNome("Samuel");
		System.out.println(conta.getTitular().getNome() + conta.getConta());
		Conta conta2 = new Conta(564);
		Conta conta3 = new Conta(567);
		System.out.println(Conta.getotal());
	}
}
