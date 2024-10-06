package ES4.punto1;

public class ProdottoInSpedizione extends Prodotto{
    private Imballaggio imballaggio;
    private String indirizzo;

    public ProdottoInSpedizione(Certificato certificato, String denominazione, double peso, Imballaggio imballaggio,String indirizzo) {
        super(certificato, denominazione, peso);
        this.imballaggio = imballaggio;
    }
    public Imballaggio getImballaggio() {
        return imballaggio;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public void setImballaggio(Imballaggio imballaggio) {
        this.imballaggio = imballaggio;
    }
    public double getPeso(){
        return super.getPeso() + imballaggio.getPeso();
    }
    public String toString() {
        return super.toString() +"{imballaggio" + imballaggio + "indirizzo" + indirizzo +"]";
    }
    public boolean equals(Object o){
        if(!super.equals(o)) return false;

        ProdottoInSpedizione p =(ProdottoInSpedizione) o;
        return imballaggio.equals(p.imballaggio) && indirizzo.equals(p.indirizzo);
    }
}
