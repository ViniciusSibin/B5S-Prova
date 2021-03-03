package prova.admissao.perguntas;

public class Pergunta2 {
	public int mediaSimples(int[] array) {
		int soma = 0;
		if (array.length < 3) {
			return 0;// false
		} else {
			for (int i = 0; i <= array.length - 1; i++) {
				soma = soma + array[i];
				if (i == array.length - 1) {
					soma = soma / array.length;
					return soma;
				}
			}
		}
		return 0;
	}
}