package ES4.punto1;

public class ProdottoInMagazzino extends Prodotto{
    private String codice;

    public ProdottoInMagazzino(Certificato certificato,String denominazione, double peso, String codice){
        super(certificato,denominazione,peso);
        this.codice = codice;
    }
    public String getCodice() {
        return codice;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }
    @Override
    public String toString() {
        return "ProdottoInMagazzino{" +
                "codice='" + codice + '\'' +
                '}';
    }
    public boolean equals(Object o){
        if (!super.equals(o)) return false;

        ProdottoInMagazzino p = (ProdottoInMagazzino) o;
        return codice.equals(p.codice);
    }
}
