public class TestaReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marquin");
		g1.setSalario(1000);
		
		Funcionario f = new Gerente();
		f.setSalario(1000);
		
		EditorVideo e = new EditorVideo();
		e.setSalario(1000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(e);
		
		System.out.println(controle.getSoma());
		
	}

}
