package ES4.punto1;

import java.util.Objects;

public class Prodotto extends Peso{
    private Certificato certificato;
    private String denominazione;

    public Prodotto(Certificato certificato,String denominazione,double peso){
        super(peso);
        this.certificato = certificato;
        this.denominazione = denominazione;
    }

    public Certificato getCertificato() {
        return certificato;
    }

    public void setCertificato(Certificato certificato) {
        this.certificato = certificato;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }
    public String toString(){
        return getClass().getName() + "[certificato" + certificato + "denominazione" + denominazione + "peso" + getPeso() +"]";}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;

        Prodotto p = (Prodotto) o;
        return certificato.equals(p.certificato) && denominazione.equals(p.denominazione) && getPeso() == p.getPeso();
    }

}

