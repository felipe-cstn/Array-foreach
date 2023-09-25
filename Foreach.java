package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Foreach {
	public static void main(String[] args) {
		int i = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas deseja informar? ");
		int tam = entrada.nextInt();
		
		double[] array = new double[tam];
		double[] notas = new double[tam];
		
		int n=1;
		double soma=0;
		for(double cadastrar: array) {
			System.out.printf("Informe a %d nota da posicao %d: ", n, i);
			cadastrar = entrada.nextDouble();
			notas[i] = cadastrar;
			soma += notas[i];
			i++;
			n++;
		}
		
		System.out.printf("\n\nNotas cadastradas: \n");
		
		
		for(double mostrar: notas) {
			System.out.println(mostrar);
		}
		double media = soma/notas.length;
		System.out.printf("Media das notas: %.2f ", media);
	entrada.close();
	}
}
