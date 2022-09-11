import java.util.Random;

public class Sequeciador {
    private static Sequenciador instance = null;
    // numero maximo de botoes que piscarao
    private int tam = 21;
    /*
     * quantidade de botoes coloridos, serve para informar ao programa qual o
     * intervalo de
     * numeros ramdomicos
     */
    private int range;
    // numero da rodada atual;
    private int rodada;
    // Sequencia aleatoria gerada pelo programa
    private String sequencia[] = new String[tam];
    // sequencia gerada pelo usuario (apagada a cada nova rodada )
    private String sequenciaUsuario[] = new String[tam];
    // objeto que criar a ramdomizados de acordo com o range
    private Random randomizador = new Random();

    private Sequenciador(int range){
        this.range = range;
        // inicia na rodada 0
        this.rodada = 0;
        // gera toda sequencia randomica
        gerarSequencia();
        //inicia a sequencia do usuario
        apagarSequeciaUsuario();
    }
}
