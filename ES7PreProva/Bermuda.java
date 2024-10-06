package ES7PreProva;

import java.io.Serializable;

public class Bermuda extends Pantalone implements Serializable {
    private final int lunghezza;

    public Bermuda(String nome, String marca,int prezzo, String taglia, boolean disponibile, String tipoTessuto, String modello, int lunghezza){
        super(nome, marca, prezzo, taglia,disponibile,tipoTessuto, modello);
        if(lunghezza <0) throw new RuntimeException("lunghezza non valida");
        this.lunghezza = lunghezza;
        }
    public int getLunghezza() {
        return lunghezza;
    }

    @Override
    public String toString() {
        return "Bermuda{" +
                "lunghezza=" + lunghezza +
                '}';
    }
}

