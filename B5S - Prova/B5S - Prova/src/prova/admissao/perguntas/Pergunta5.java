package prova.admissao.perguntas;

public class Pergunta5 {
	public static String substituirCaracteres(String string) {
		string = string.replace('a', '?');
		string = string.replace('e', '?');
		string = string.replace('i', '?');
		string = string.replace('o', '?');
		string = string.replace('u', '?');
		return string;
	}
}