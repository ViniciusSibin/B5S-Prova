package prova.admissao.perguntas;

public class Pergunta6 {
	public static int[] ordenarArray(int[] array) {
		int aux, ord;
		for (int i = 0; i <= array.length - 1; i++) {
			if (i == array.length - 1) {
				for (int x = 0; x <= array.length - 1; x++) {
					if (x == array.length - 1) {
						return array;
					}
					if (array[x] > array[x + 1]) {
						i = 0;
						break;
					}
				}
			}
			if (array[i] > array[i + 1]) {
				aux = array[i + 1];
				ord = array[i];
				array[i] = aux;
				array[i + 1] = ord;
			}
		}
		return array;
	}
}