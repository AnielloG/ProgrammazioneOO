package ES12;

public class ProdottoNonAlimentare extends Prodotto{
    private materiale tipoMateriale;
    private boolean pericoloso;

    public ProdottoNonAlimentare(String codice,String descrizioneProd,int prezzo, int quantitaDisponibili,materiale tipoMateriale,boolean pericoloso){
        super(codice,descrizioneProd,prezzo,quantitaDisponibili);
        this.tipoMateriale = tipoMateriale;
        this.pericoloso = pericoloso;
    }

    public materiale getTipoMateriale() {
        return tipoMateriale;
    }

    public boolean isPericoloso() {
        return pericoloso;
    }

    public void setTipoMateriale(materiale tipoMateriale) {
        this.tipoMateriale = tipoMateriale;
    }

    public void setPericoloso(boolean pericoloso) {
        this.pericoloso = pericoloso;
    }
    public String toString(){
        String pericoloso = isPericoloso() ? "Si" : "No";
        return super.toString() + "[tipoMateriale" + tipoMateriale + "Pericoloso" + pericoloso + "]";
    }
}
