package nadalete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Baralho baralho = new Baralho();
        Scanner scan = new Scanner(System.in);

        // imprimindo opções para o usuário
        while (true){
            System.out.println("╔════════════════════════════════════════════════════╗");
            System.out.println("║           ♣♥   Baralho Royale   ♠♦                 ║");
            System.out.println("║ [1] Embaralhar as cartas                           ║");
            System.out.println("║ [2] Distribuir cartas                              ║");
            System.out.println("║ [3] Verificar cartas disponívei                    ║");
            System.out.println("║ [4] Conferir todas as cartas                       ║");
            System.out.println("║ [5] Abandonar o jogo... por enquanto!              ║");
            System.out.println("╚════════════════════════════════════════════════════╝");

            System.out.print("Que caminho deseja seguir? ");

            int option = scan.nextInt();
            scan.nextLine();

            // cases para chamar cada função criada
            switch (option){

                case 1:
                    baralho.embaralhar();
                    System.out.println("O baralho foi embaralhado!");
                    break;

                case 2:
                    Carta cartaDistribuida = baralho.distribuirCarta();
                    if(cartaDistribuida != null){
                        System.out.println("Carta Distribuida: " + cartaDistribuida);
                    }else{
                        System.out.println("Não há cartas no baralho");
                    }
                    break;

                case 3:
                    System.out.println("Informe o naipe da carta (ex: Copas): ");
                    String naipe = scan.nextLine();
                    System.out.println("Informe o nome da carta (ex: Q, J, 5, 7)): ");
                    String nome = scan.nextLine();

                    if(baralho.hasCarta(nome, naipe)){
                        System.out.println("A carta " + nome + " de " + naipe + " está no baralho.");
                    }else{
                        System.out.println("Carta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.println("Cartas no baralho: ");
                    baralho.imprimirBaralho();
                    break;

                case 5:
                    System.out.println("Encerrando... Obrigada por jogar! :)");
                    scan.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente");
            }

            System.out.println("\nPressione Enter para prosseguir...");
            scan.nextLine();
        }
    }
}