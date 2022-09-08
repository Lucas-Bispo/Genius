// Classe ultilizada para criar os botoes coloridos do jogo

import javax.swing.*;

class Botao extends JButton {
    private static final long serialVersionUID = 1L;
    // atribuindo ultilizado para saber se o botao pode ser clicado
    private boolean status;
    // atribuindo ultilizado para facilitar o uso imagens e musicas
    private String nome;

    // criar o botao com o construtor do JButton
    public Botao(String nome) {
        super(new ImageIcon(Jogo.getImage(nome + "_apagdo.jpg")));
        // indica a imagem do botao quando estiver sob o mause
        setRolloverIcon(new ImageIcon(Jogo.getImage(nome + "_mercado.jpg")));
        // remove a borda do botao
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.nome = nome;

    }

    public void setStatus(boolean status) {
        this.status = status;

    }

    public boolean getStatus() {
        return (this.status);
    }

    public String getNome() {
        return (this.nome);
    }

    // altera as imagens do botao recebido por paramentro para acesso
    public void acenderBotao(Botao botao) {
        botao.setIcon(new ImageIcon(Jogo.getImage(Botao.getNome() + "_aceso.jpg")));
        botao.setRolloverIcon(new ImageIcon(Jogo.getImage(Botao.getNome() + "_aceso.jpg")));
    }

}