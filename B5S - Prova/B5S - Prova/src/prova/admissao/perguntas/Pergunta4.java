package prova.admissao.perguntas;

public class Pergunta4 {
	public static String inverterString(String string) {
		String inverso = "";
		char arrayChar[] = string.toCharArray();
		for (int i = arrayChar.length - 1; i >= 0; i--) {
			inverso += String.valueOf(arrayChar[i]);
		}
		return inverso;
	}
}