import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int valor, centena = 0, n50 = 0, n10 = 0, n5 = 0, n1 = 0;
		
		System.out.println("Valor mínimo 10, máximo 600");
		System.out.println("Informe o valor a ser retirado: ");
		valor = entrada.nextInt();
		entrada.nextLine();
		if ((valor >= 10) & (valor <= 600)) {
			if (valor >= 100) {
				centena = valor / 100;
				valor = valor % 100;
			}
			
			if (valor >= 10) {
				if (valor >= 50) {
					n50 = valor / 50;
					valor = valor % 50;
				}
				if (valor >= 10){
					n10 = valor / 10;
					valor = valor % 10;
				}
				if (valor >= 5) {
					n5 = valor / 5;
					valor = valor % 5;
				}
				if (valor >= 1) {
					n1 = valor / 1;
					valor = valor % 1;
				}
			}
			System.out.println("Notas de 100: " + centena);
			System.out.println("Notas de 50: " + n50);
			System.out.println("Notas de 10: " + n10);
			System.out.println("Notas de 5: " + n5);
			System.out.println("Notas de 1: " + n1);
		}
		else {
			System.out.println("O valor informado não é aceito!");
			System.out.println("Informe um valor entre 10 e 600");
		}
		
		entrada.close();
	}

}
