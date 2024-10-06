package ES8;

import java.util.ArrayList;

public class AttrezzaturaCardio extends AttrezzatureSportive{
    private String idCardio;
    private String marca;
    private String modello;
    private int annoAcquisto;
    private boolean stato;

    public AttrezzaturaCardio(String idCardio,String marca,String modello, int annoAcquisto, boolean stato){
        super();
        this.idCardio = idCardio;
        this.marca = marca;
        this.annoAcquisto = annoAcquisto;
        this.stato =  stato;
    }

    public void setIdCardio(String idCardio) {
        this.idCardio = idCardio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnnoAcquisto(int annoAcquisto) {
        this.annoAcquisto = annoAcquisto;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public String getIdCardio() {
        return idCardio;
    }

    public boolean getStato() {
        return stato;
    }

    public int getAnnoAcquisto() {
        return annoAcquisto;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }
    @Override
    public String toString(){
        return getClass().getName() + "[idAttrezzatura"+ getIdCardio() + "marca" + getMarca() +"modello"+ getModello() +
                "annoacquisto" + getAnnoAcquisto() + "statoPrestito" + getStato() + "]";
    }
}
