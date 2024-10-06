package ES7PreProva;

import java.io.Serializable;

public class Maglia extends Capo implements Serializable {
    private final String materiale;
    private final String colore;

    public Maglia(String nome, String marca, int prezzo, String taglia,boolean disponibile,String materiale, String colore){
        super(disponibile,marca,prezzo,nome,taglia);
        this.colore = colore;
        this.materiale = materiale;
    }

    public String getColore() {
        return colore;
    }

    public String getMateriale() {
        return materiale;
    }

    @Override
    public String toString() {
        return "Maglia{" +
                "materiale='" + materiale + '\'' +
                ", colore='" + colore + '\'' +
                '}';
    }
}
