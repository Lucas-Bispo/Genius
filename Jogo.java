import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jogo extends JFrame {
    private static final long serialVersionUID = 1L;
    private Sons musica = new Sons();
    // cria o objeto que armazena as sequecias
    private Sequenciador sequecia  = new Sequenciador.getInstance(range:6);
    // janela  que armazena os demais componentes
    private Container janela = getContentPane();
    // imagens de fundo das telas
    private JLabel abertura = new JLabel(new ImageIcon(getImage("")));
    private JLabel tela = new JLabel(new ImageIcon(getImage("tela.jpg")));

    // mensagem da tela do jogo
    private JLabel mensagem = new JLabel(new ImageIcon(getImage("aguarde.jpg")));
    // cada botao da tela inicial
    private JButton iniciar = new JButton(new ImageIcon(getImage("iniciar.jpg")));
    private JButton sair = new JButton(new ImageIcon(getImage("sair.jpg")));

    // cada bot�o colorido
    private Botao azul = new Botao("azul");
    private Botao amarelo = new Botao("amarelo");
    private Botao verde = new Botao("verde");
    private Botao vermelho = new Botao("vermelho");
    private Botao laranja = new Botao("laranja");
    private Botao violeta = new Botao("violeta");

    // saber se o usuario ainda pode jogar
    private boolean jogoAtivo = true;

    public Jogo() {
        // define o nome da barra de titulo da janela
        super("Genius - Jogo");
        // define o Layout do conteiner (null permite que eu mesmo posicione os
        // graficos)
        setLayout(null);
        // define o tamanho da janela\
        setSize(550, 485);
        // informa que a posicao inicial da janela centralizada
        setLocationRelativeTo(null);
        // define que nao pode ser redefinido a tela
        setResizable(false);
        // define como visivel
        setVisible(true);
        // troca a musica de tela aberta
        musica.escolheMusica("abertura");
        musica.iniciar();
    }

    // monta a tela de abertura do jogo
    public void tela_abertura() {

        // adiciona a imagem de fundo

    }

}