package ES7PreProva;

import java.io.Serializable;

public class Pantalone extends Capo implements Serializable {
    private String tipoTessuto;
    private String modello;
    
    public Pantalone(String nome, String marca, int prezzo, String taglia, boolean disponibile,String tipoTessuto, String modello){
        super(disponibile,marca,prezzo,taglia, nome);
        this.modello = modello;
        this.tipoTessuto = tipoTessuto;
    }

}
