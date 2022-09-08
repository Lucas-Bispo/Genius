
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

}
