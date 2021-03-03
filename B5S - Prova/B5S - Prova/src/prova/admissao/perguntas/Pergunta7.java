package prova.admissao.perguntas;

public class Pergunta7 {
	public static int primeiroValorNaoRepetido(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			int aux1 = 0;
			for (int x = 0; x <= array.length - 1; x++) {
				if (array[i] == array[x]) {
					aux1++;
				}
			}
			if (aux1 < 2) {
				return array[i];
			}
		}
		return 0;
	}
}