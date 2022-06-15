
public class TestaCodigo {

	public static void main(String[] args) {
		Funcionario sam = new Gerente();
		sam.setNome("Samuel");
		sam.setCpf("492098539-23");
		sam.setSalario(1000);
		
		System.out.println(sam.getNome());
		System.out.println(sam.getBonificacao());

	}

}
