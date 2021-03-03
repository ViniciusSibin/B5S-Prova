package prova.admissao.perguntas;

public class Pergunta3 {
	public int parOuImpar(int[] array) {
		int pares = 0;
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] > 0 && array[i] % 2 == 0) {
				pares++;
			}
		}
		return pares;
	}
}