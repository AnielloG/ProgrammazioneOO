package ES8;

public class AttrezzaturaPesi extends AttrezzatureSportive{
    private String idPesi;
    private String tipo;
    private String marca;
    private int annoAcquisto;
    private boolean stato;

    public AttrezzaturaPesi(String idPesi,String tipo,String marca,int annoAcquisto, boolean stato){
        super();
        this.idPesi = idPesi;
        this.tipo = tipo;
        this.marca = marca;
        this.annoAcquisto = annoAcquisto;
        this.stato = stato;
    }

    public void setIdPesi(String idPesi) {
        this.idPesi = idPesi;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnnoAcquisto(int annoAcquisto) {
        this.annoAcquisto = annoAcquisto;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public String getIdPesi() {
        return idPesi;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAnnoAcquisto() {
        return annoAcquisto;
    }

    public boolean isStato() {
        return stato;
    }

    @Override
    public String toString(){
        return getClass().getName() + "[idAttrezzatura" + getIdPesi() + "tipo" + getTipo() + "marca" + getMarca() +
                "Annoacquisto" + getAnnoAcquisto() + "stato prestito" + isStato() + "]";
    }
}
