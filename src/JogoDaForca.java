import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        boolean jogar = true;
        do {
            System.out.println(" * Bem vindo ao JOGO DA FORCA - Nivel 1 * ");
            // ARRAY CONTENDO AS PALAVRAS
            String array[] = {
                "java", "sistema", "informacao", "netbeans", "while", "tecnologia", "double", "algoritmo", "programacao", "inteiro"};
            //string que sorteia o indice do array
            String palavra = array[(int) (Math.random() * array.length)];
            // variavel que armazena o tamanho da palavra
            int TamanhoPalavras = palavra.length();
            System.out.println("Dica: a palavra cont�m " + TamanhoPalavras + " letras e est� relacionada com inform�tica.");
            System.out.println("\n\n\n");

            // variavel indica que o jogo esta verdadeiro ( esta valendo )
            boolean jogo = true;
            do {
                // array que contem as letras sorteadas
                char letras[] = new char[TamanhoPalavras];
                for (int x = 0; x < TamanhoPalavras; x++) {
                    letras[x] = palavra.charAt(x);
                    System.out.print(" _ ");
                }
                // booleado tentivas (true) permite que o usuario coloque as letras.
                boolean tentativas = true;
                int erro = 0;
                // array para armazenamento das letras corretas (as que o jogador digita e est�o na palavra sorteada)
                char letraCorreta[] = new char[TamanhoPalavras];
                while (tentativas) {
                    if (erro < 3) {
                        System.out.println("\nDigite uma letra.");
                        /* a letra digitada ('char letra', logo abaixo) percorrer� os valores de um array (letras[]), um a um, para  
                         encontrar caracteres iguais. portanto, vari�vel 'letraerrada' armazena o valor quando a letra n�o se encontra no array */
                        int letraErrada = 0;

                        char letra = entrada.next().charAt(0);
                        // cria vari�vel para armazenar os valores acertados pelo jogador
                        String PalavraNova = "";
                        for (int lc = 0; lc < TamanhoPalavras; lc++) {
                            /* se a letra digitada se encontra na posi��o lc do array 'letras[]', o valor � armazenado no mesmo
                             �ndice do array 'letracorreta'. caso contr�rio, incrementa o valor 'letraerrada' */
                            if (letra == letras[lc]) {
                                letraCorreta[lc] = letra;
                            } else {
                                letraErrada++;
                            }
                            /* se j� contiver a letra certa na mesma posi��o em que a letra se encontra na palavra sorteada, a
                             letra � impressa e seu valor � adicionado � vari�vel que cont�m os dados certos digitados pelo
                             jogador ('palavraNova'). caso contr�rio, imprime uma underline (_) */
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
                        /* caso acerte as letras formando a palavra oculta a variavel 
                         'tentativa' vai para  'false', e termina o jogo ! */
                        if (palavra.equals(PalavraNova)) {
                            System.out.println("\n\n Voce acertou , a palara � :  '" + palavra + "'.");
                            tentativas = false;
                        } else {//numero de tentaivas para cada erro
                            if (erro == 0) {} 
                            else if (erro == 1) {} 
                            else if (erro == 2) {} 
                            else if (erro == 3) {}
                        }
                    } else {
                        System.out.println("|\n VOC� PERDEU ! ");
                        System.out.println("  A PALAVRA CORRETA � : " + palavra + "'");
                        tentativas = false;
                    }
                }
                //jogo false ( finaliza o jogo )
                jogo = false;
            } while (jogo);

            // mensagem se o jogador quer ogar novamente
            System.out.println("\nIniciar uma nova Partida  ? ('S' para jogar e 'N' para n�o jogar)?");

            char jogarNovamente = entrada.next().charAt(0);
            if (jogarNovamente == 'S' || jogarNovamente == 's') {
                jogar = true;//caso queira jogar novamente .
            } else {//caso digite nao ele fecha o jogo e manda a mensagem
                jogar = false;
                System.out.println("\n  THE END GAME   \n");
            }
        } while (jogar);
        entrada.close();

    }
}