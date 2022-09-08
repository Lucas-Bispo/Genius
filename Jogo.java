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

}