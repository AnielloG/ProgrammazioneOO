package ES6ProvaEsame;

import java.io.Serializable;

public class Macchina extends Autovettura implements Serializable {
    private int matricola;
    private String targa;
    private final int nMarce;

    public Macchina(String tipoAutovettura,int nRuote,int cilindrata,String colore,int matricola,String targa,int nMarce) {
        super(tipoAutovettura,nRuote,cilindrata,colore);
        this.matricola = matricola;
        this.nMarce = nMarce;
        this.targa = targa;
    }
    public int getMatricola() {
        return matricola;
    }

    public int getnMarce() {
        return nMarce;
    }
    public String getTarga(){
        return targa;
    }
    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public void Avanti(){
    }
    public void Indietro(){
    }
    @Override
    public void Accendi(Auto a) throws Eccezzioni.MotoreGiaAccesoException {
    }
    @Override
    public void Spegni(Auto a) throws Eccezzioni.MotoreGiaSpentoException {
    }

}
