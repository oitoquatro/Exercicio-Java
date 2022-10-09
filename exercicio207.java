package fundamento;

import java.util.Scanner;

public class exercicio207 {

	public static void main(String[] args) {
		// Faça um programa que receba um número inteiro entre 1 e 12 e informe o mês correspondente, por exemplo,
		//se a entrada for: 1, exiba Janeiro; 2, exiba Fevereiro;... OBS.: Utilizar o comando switch case

		Scanner leitor = new Scanner(System.in);
		
		int mes;
		
		System.out.print("Digite o mês:");
		mes = leitor.nextInt();
		
		switch (mes) {
		case 1: System.out.println("*****Janeiro*****");break;
		case 2: System.out.println("*****Fevereiro*****");break;
		case 3: System.out.println("*****Marça*****");break;
		case 4: System.out.println("*****Abril*****");break;
		case 5: System.out.println("*****Maio*****");break;
		case 6: System.out.println("*****Junho*****");break;
		case 7: System.out.println("*****Julho*****");break;
		case 8: System.out.println("*****Agosto*****");break;
		case 9: System.out.println("*****Setembro*****");break;
		case 10: System.out.println("*****Outubro*****");break;
		case 11: System.out.println("*****Novembro*****");break;
		case 12: System.out.println("*****Desembro*****");break;
		default : System.out.println("valor invalido");
		
		
		
		
		}
	}

}
