// Classe que encapsula a fucao principal

import java.awt.event.*;

public class Genius {

    public static void main(String[] args) {
        // Cria a instacia de Jogo
        Jogo jogo = new Jogo();

        // chama a funcao que monta a tela de abertura
        jogo.tela_abertura();

        // evento que finaliza o programa quando clicar no x do programa
        jogo.addWindowListener(
                new WindowAdapter() {
                    public void windowClosed(WindowEvent windowEvent) {
                        // encerra o aplicativo
                        System.exit(0);
                    }

                }

        );

    }
}