
public class TestandoSwitch {
	public static void main(String[] args) {
		int mes = 9;
		switch (mes) { //condicao
		case 1: //1 = a resultado da condicao
			System.out.println("Janeiro"); //execucao
			break; //para caso executado
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default: //caso tudo falso roda default
			System.out.println("Mes invalido");
			break;
		}
	}
}