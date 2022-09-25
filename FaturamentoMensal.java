
public class FaturamentoMensal {

	public static void main(String[] args) {
		
		double valores[] = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0,
						 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852,
						 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};
	
		double menorValor = 0;
		int menorValorIndice = 0;
		
		double maiorValor = 0;
		int maiorValorIndice = 0;
		
		int totalDiasUteis = 0;
		double totalMes = 0;
		
		double media;
		
		for (int i = 0; i < valores.length; i++) {
				
			if(valores[i] != 0) {
				totalDiasUteis += 1;
				totalMes += valores[i];
					
				if (i == 0) {
					menorValor = valores[i];
					maiorValor = valores[i];
				} else {
				
					if(valores[i] > maiorValor) {
						maiorValor = valores[i];
						maiorValorIndice = i;
					}
					
					if(valores[i] < menorValor) {
						menorValor = valores[i];
						menorValorIndice = i;
					}
					
				}
		
			}	
			
		}
		
		media = totalMes / totalDiasUteis;
		
		System.out.println("O maior faturamento foi no dia " + (maiorValorIndice+1) + ", valor do faturamento " + maiorValor);
		System.out.println("O menor faturamento foi no dia " + (menorValorIndice+1) + ", valor do faturamento " + menorValor);
		
		System.out.printf("A media de faturamento do mês foi %.2f", media);
		
		System.out.println();
		
		System.out.printf("O total de dias trabalhados foi de " + totalDiasUteis + " dias");
		
	}	

}
