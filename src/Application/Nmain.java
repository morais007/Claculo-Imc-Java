package Application;

import java.util.Locale;
import java.util.Scanner;

public class Nmain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular IMC");
		System.out.print("Qual a sua Altura: ");
		double altura = sc.nextDouble();
		System.out.print("Qual o seu Peso: ");
		double peso = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println(imc);
		
		if(imc < 18.5) {
			System.out.println("MAGREZA");
		}else if(imc > 18.5 && imc < 25){
			System.out.println("NORMAL");
		}else if(imc > 25 && imc < 30) {
			System.out.println("SOBREPESO");
		}else if(imc > 30 && imc < 40) {
			System.out.println("OBESIDADE");
		}else {
			System.out.println("Obesidade Grave");
		}
		
		
		
		sc.close();
	}

}
