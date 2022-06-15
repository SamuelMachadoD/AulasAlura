public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);
		cc.deposita(100.0);
		ContaPoupanca cp = new ContaPoupanca(500);
		cp.deposita(200.0);
		SeguroDeVida seguro = new SeguroDeVida();
		
		//cc.transferir(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		CaculadorImposto c = new CaculadorImposto();
		c.registra(seguro);
		c.registra(cc);
		System.out.println(c.getTotalImposto());
		
	}

}
