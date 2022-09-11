
// classe que faz a gerencia das musicas tocadas durante o programa
import java.io.InputStream;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

public class Sons {
    private InputStream som;
    private Sequencer trocar;

    // escolhe qual musica ser tocada pelo metodo iniciar
    public void escolheMusica(String musica) {
        som = this.getClass().getResourceAsStream("/" + musica + ".mid");

    }

    // inicia a musica selecionada pelo metodo escolheMusica
    public void iniciar() {
        try {
            this.trocar = MidiSystem.getSequencer();
            this.trocar.open();
            this.trocar.setSequence(this.som);
            this.trocar.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // para a musica que esiver tocando
    public void parar() {
        this.trocar.stop();
        this.trocar.close();
    }

}
