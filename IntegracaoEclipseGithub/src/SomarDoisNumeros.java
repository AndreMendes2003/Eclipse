import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);

	public static void main (String args[]){
		//Declaracao as variáveis
		int num1, num2, soma;
	
		//Ler primeiro numero
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();

        //Ler segundo numero
		System.out.println("Digite outro número: ");
		num2 = sc.nextInt();
	
		//Somar os numeros
		soma = num1 + num2;
	
		//Mostrar a soma na tela
		System.out.println("Soma =  " + soma);
	}
}