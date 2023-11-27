
package ultraemojicombat;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		//Lutador l = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		// A LINHA COMENTADA ACIMA É UMA DECLARAÇÃO TRADICIONAL DE UMA NOVA INSTÂNCIA DE CLASSE. COMO TEREMOS DIVERSAS INSTÂNCIAS A DECLARAR
		//AQUI, VAMOS TRANSFORMAR ESTA DECLARAÇÃO COLETIVA EM UM VETOR.
		
		Lutador l[] = new Lutador[6]; // NO CASO DO VETOR A DECLARAÇÃO DA NOVA INSTÂNCIA NÃO SERÁ FECHADA COM PARÊNTESES, MAS COM COLCHETES,
									  // ONDE TAMBÉM SERÁ PASSADO COMO PARÂMETRO A EXTENSÃO DESSE VETOR, NO NOSSO CASO, 6.
		
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Autrália", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 81.6f, 13, 0, 2);
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		l[1].apresentar();
		l[1].Status();

	}

}
