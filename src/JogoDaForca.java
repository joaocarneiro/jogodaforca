import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        boolean jogar = true;
        do {
        	System.out.println();
            System.out.println(" * GAME OF FORK* ");
            System.out.println("      |||| ");
            System.out.println("      ||||");
            System.out.println("      \\__/");
            System.out.println("       ||");
            System.out.println("       ||");
            System.out.println("       ||");
            System.out.println("       ||");
            System.out.println("       **");
            System.out.println();
            
            String array[] = {"java", "sistema", "informacao", "programacao", "html", "tecnologia", "double", "algoritimo", "programacao", "inteiro", "php",
            		 "software", "eclipse", "site"};
            String palavra = array[(int) (Math.random() * array.length)];
            int TamanhoPalavras = palavra.length();
            System.out.println("Dica: a palavra contém " + TamanhoPalavras + " letras e está relacionada com Informática.");
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
                            System.out.println("\nNão existe essa letra");
                            erro++;
                        }
                        if (palavra.equals(PalavraNova)) {
                        	image(3);
                            System.out.println("\n\n Acertou , a palavra é :  '" + palavra + "'.");
                            tentativas = false;
                        } else {
                            if (erro == 0) {} 
                            else if (erro == 1) {
                            	System.out.println("Tem mais 2 vidas");
                            	image(1);
                            	
                            } 
                            else if (erro == 2) {
                            	System.out.println("Tem mais 1 vida");  
                            	image(1);
                            } 
                        }
                    } 
                    else {
                    	image(2);
                        System.out.println("\nA PALAVRA CORRETA É : '" + palavra + "'");
                        tentativas = false;
                    }
                }
                jogo = false;
            } while (jogo);

            System.out.println("\nQuer jogar de novo? ('S' para sim e 'N' para não)");

            char jogarNovamente = entrada.next().charAt(0);
            if (jogarNovamente == 'S' || jogarNovamente == 's') {
                jogar = true;
            } else {
                jogar = false;
                System.out.println("\n  THE END OF FORK   \n");
            }
        } while (jogar);
        entrada.close();
    }
	
	public static void image(int id){
		switch(id){
		case 1: 
			System.out.println("                  	  |  \\ \\ | |/ /");
        	System.out.println("                        |  |\\ `' ' /");
        	System.out.println("                        |  ;'aorta \\      / , pulmonary");
        	System.out.println("                        | ;    _,   |    / / ,  arteries");
        	System.out.println("               superior | |   (  `-.;_,-' '-' ,");
        	System.out.println("              vena cava | `,   `-._       _,-'_");
        	System.out.println("                        |,-`.    `.)    ,<_,-'_, pulmonary");
        	System.out.println("                       ,'    `.   /   ,'  `;-' _,  veins");
        	System.out.println("                      ;        `./   /`,    \\-'");
        	System.out.println("                      | right   /   |  ;\\   |\\");
        	System.out.println("                      | atrium ;_,._|_,  `, ' \\");
        	System.out.println("                      |        \\    \\ `       `,");
        	System.out.println("                      `      __ `    \\   left  ;,");
        	System.out.println("                       \\   ,'  `      \\,  ventricle");
        	System.out.println("                        \\_(            ;,      ;;");
        	System.out.println("                        |  \\           `;,     ;;");
        	System.out.println("               inferior |  |`.          `;;,   ;'");
        	System.out.println("              vena cava |  |  `-.        ;;;;,;'");
        	System.out.println("                        |  |    |`-.._  ,;;;;;'");
        	System.out.println("                        |  |    |   | ``';;;'  FL");
        	System.out.println("                                aorta");                            	
        	break;
		case 2:
			System.out.println("\n            O SEU CORAÇÃO DEIXOU DE BATER ! ");
            System.out.println("                        _  /)");
            System.out.println("                        mo / )");
            System.out.println("                        |/)\\)");
            System.out.println("                         /\\_");
            System.out.println("                         \\__|=");
            System.out.println("                        (    )");
            System.out.println("                        __)(__");
            System.out.println("                  _____/      \\_____");
            System.out.println("                 |  _     ___   _   ||");
            System.out.println("                 | | \\     |   | \\  ||");
            System.out.println("                 | |  |    |   |  | ||");
            System.out.println("                 | |_/     |   |_/  ||");
            System.out.println("                 | | \\     |   |    ||");
            System.out.println("                 | |  \\    |   |    ||");
            System.out.println("                 | |   \\. _|_. | .  ||");
            System.out.println("                 |                  ||");
            System.out.println("                 |  xxxxxxxxxxxxxx  ||");
            System.out.println("                 |                  ||");
            System.out.println("         *       | *   **    * **   |**      **");
            System.out.println("          \\))...../.,(//,,..,,\\||(,,.,\\,.((//");
            System.out.println("          \\))lalala/.,(//lalala\\||(lalala,.((//");
		break;
		case 3:
			
			System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("$$$$$'`$$$$$$$$$$$$$'`$$$");
			System.out.println("$$$$$$  $$$$$$$$$$$  $$$$");
			System.out.println("$$$$$$$  '$/ `/ `$' .$$$$");
			System.out.println("$$$$$$$$. i  i  /! .$$$$$");
			System.out.println("$$$$$$$$$.--'--'   $$$$$$");
			System.out.println("$$^^$$$$$'        J$$$$$$");
			System.out.println("$$$   ~\"\"   `.   .$$$$$$$");
			System.out.println("$$$$$e,      ;  .$$$$$$$$");
			System.out.println("$$$$$$$$$$$.'   $$$$$$$$$");
			System.out.println("$$$$$$$$$$$$.    $$$$$$$$");
			System.out.println("$$$$$$$$$$$$$     $$$$$$");
			System.out.println("-------------------------");
			System.out.println("        I LOVE YOU");
			break;
		
		}
	}
}