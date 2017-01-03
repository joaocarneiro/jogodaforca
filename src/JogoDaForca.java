import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        boolean jogar = true;
        do {
            System.out.println(" * Bem vindo ao JOGO DA FORCA - Nivel 1 * ");
            String array[] = {"java", "sistema", "informacao", "programacao", "html", "tecnologia", "double", "algoritimo", "programacao", "inteiro", "php",
            		 "software", "eclipse", "site"};
            String palavra = array[(int) (Math.random() * array.length)];
            int TamanhoPalavras = palavra.length();
            System.out.println("Dica: a palavra contém " + TamanhoPalavras + " letras e está relacionada com informática.");
            System.out.println("\n\n\n");

            boolean jogo = true;
            do {
                char letras[] = new char[TamanhoPalavras];
                for (int x = 0; x < TamanhoPalavras; x++) {
                    letras[x] = palavra.charAt(x);
                    System.out.print(" _ ");
                }
                boolean tentativas = true;
                int erro = 0;
                char letraCorreta[] = new char[TamanhoPalavras];
                while (tentativas) {
                    if (erro < 3) {
                        System.out.println("\nDigite uma letra.");
                        int letraErrada = 0;

                        char letra = entrada.next().charAt(0);
                        String PalavraNova = "";
                        for (int lc = 0; lc < TamanhoPalavras; lc++) {
                            if (letra == letras[lc]) {
                                letraCorreta[lc] = letra;
                            } else {
                                letraErrada++;
                            }
                            if (letraCorreta[lc] == letras[lc]) {
                                PalavraNova += letraCorreta[lc];
                                System.out.print(" " + letraCorreta[lc] + " ");

                            } else {
                                System.out.print(" _ ");
                            }
                        }
                        if (letraErrada >= TamanhoPalavras) {
                            System.out.println("\nNao existe essa letra");
                            erro++;
                        }
                        if (palavra.equals(PalavraNova)) {
                            System.out.println("\n\n Voce acertou , a palara é :  '" + palavra + "'.");
                            tentativas = false;
                        } else {
                            if (erro == 0) {} 
                            else if (erro == 1) {} 
                            else if (erro == 2) {} 
                            else if (erro == 3) {}
                        }
                    } else {
                        System.out.println("|\n VOCÊ PERDEU ! ");
                        System.out.println("  A PALAVRA CORRETA É : " + palavra + "'");
                        tentativas = false;
                    }
                }
                jogo = false;
            } while (jogo);

            System.out.println("\nIniciar uma nova Partida  ? ('S' para jogar e 'N' para não jogar)?");

            char jogarNovamente = entrada.next().charAt(0);
            if (jogarNovamente == 'S' || jogarNovamente == 's') {
                jogar = true;
            } else {
                jogar = false;
                System.out.println("\n  THE END GAME   \n");
            }
        } while (jogar);
        entrada.close();
    }
}