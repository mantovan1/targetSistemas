import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 12 20 32 

		Scanner in = new Scanner(System.in);
		
		
		int valorDigitado;
		
		System.out.println("Entre com um valor: ");
		valorDigitado = in.nextInt();
		
		if(isInFibonacci(valorDigitado) == true) {
			System.out.println("O número " + valorDigitado + " pertence a sequência Fibonacci");
		} else {
			System.out.println("O número " + valorDigitado + " * NÃO pertence a sequência Fibonacci");
		}
		
		
		
	}
	
	public static boolean isInFibonacci(int valor) {
		
		int ultimoTermo = 1, termoAnterior = 1;
		
		while (ultimoTermo < valor) {
			int temp = ultimoTermo;
			
			ultimoTermo = ultimoTermo + termoAnterior;
			
			if (ultimoTermo == valor) {
				return true;
			}
			
			termoAnterior = temp;
			
		}
		
		return false;
	}

}
