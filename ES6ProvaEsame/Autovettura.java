package ES6ProvaEsame;

public abstract class Autovettura implements Auto{
    private static int contatoreAutovetture=0;
    private String tipoAutovettura;
    private int nRuote;
    private int cilindrata;
    private String colore;

    public Autovettura(String tipoAutovettura,int nRuote,int cilindrata,String colore){
        this.tipoAutovettura = tipoAutovettura;
        this.cilindrata = cilindrata;
        this.nRuote = nRuote;
        this.colore = colore;
        contatoreAutovetture++;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getnRuote() {
        return nRuote;
    }

    public String getColore() {
        return colore;
    }
    public String getTipoAutovettura() {
        return tipoAutovettura;
    }

    public abstract void Accendi(Auto a) throws Eccezzioni.MotoreGiaAccesoException;
    public abstract void Spegni(Auto a) throws Eccezzioni.MotoreGiaSpentoException;
}
