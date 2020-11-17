import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double h, peso, peso_ideal;
		char sexo = ' ';
		
		System.out.print("Informe sua altura: ");
		h = entrada.nextDouble();
		
		System.out.print("Informe seu peso: ");
		peso = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.print("Informe seu sexo(M/F): ");
		sexo = entrada.nextLine().charAt(0);
		
		if (sexo == 'M')
			peso_ideal = (72.7 * h)-58;
		else 
			peso_ideal = (62.1 * h)-44.7;
	
		System.out.println("Altura: " + h + " Peso: " + peso + " Sexo: " + sexo);
		System.out.println("Seu peso ideal seria: " + peso_ideal);  
		
		if (peso > peso_ideal)
			System.out.println("Você está acima do peso ideal.");
		else if (peso < peso_ideal)
			System.out.println("Você está abaixo do peso ideal.");
		else
			System.out.println("Você está no peso ideal.");
		
		entrada.close();

	}

}
