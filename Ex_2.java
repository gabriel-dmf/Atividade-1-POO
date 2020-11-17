import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double salario, novo_salario;
		int porcentagem;
		
		System.out.print("Informe seu salário: R$");
		salario = entrada.nextDouble();
		
		if (salario <= 280) {
			novo_salario = salario * 1.2;
			porcentagem = 20;
		}
		else if ((salario > 280) & (salario <=700)) {
			novo_salario = salario * 1.15;
			porcentagem = 15;
		}
		else if ((salario > 700) & (salario <=1500)) {
			novo_salario = salario * 1.1;
			porcentagem = 10;
		}
		else {
			novo_salario = salario * 1.05;
			porcentagem = 5;
		}
		
		System.out.println("Salário antes do reajuste: R$" + salario);
		System.out.println("Percentual de aumento: " + porcentagem + "%");
		System.out.println("Valor aumentado: R$" + (novo_salario-salario));
		System.out.println("Novo salário: R$" + novo_salario);
		
		entrada.close();
	}

}
