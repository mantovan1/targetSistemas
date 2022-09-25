import java.util.*;

public class FaturamentoPorEstado {

	public static void main(String[] args) {
		
		double faturamentos[] = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
		String estado[] = {"SP", "RJ", "MG", "ES", "OUTROS"};
		
		double total = 0;
		
		for(double f: faturamentos) {
			total += f;
		}
		
		for(int i = 0; i < faturamentos.length; i++) {
			
			double colaboracao = (faturamentos[i]*100) / total;
			
			System.out.printf("%s - Contribuição: %.2f", estado[i], colaboracao);
			System.out.println();
			
		}
		
	}

}
