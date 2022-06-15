
public class Administrador extends Funcionario implements Autenticavel {

	private int senha;
	public double getBonificacao() {
		return 0;
	}
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	

}
