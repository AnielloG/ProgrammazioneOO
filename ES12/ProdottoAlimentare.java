package ES12;

import java.util.Date;
import java.util.Objects;

public class ProdottoAlimentare extends Prodotto{
    private Date dataScadenza;
    private final boolean prodottoCongelato;

    public ProdottoAlimentare(String codice,String descrizioneProd,int prezzo, int quantitaDisponibili,Date dataScadenza,boolean prodottoCongelato){
        super(codice,descrizioneProd,prezzo,quantitaDisponibili);
        this.dataScadenza = dataScadenza;
        this.prodottoCongelato = prodottoCongelato;
    }

    public Date getDataScadenza() {
        return dataScadenza;
    }


    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public String toString(){
        //String prodottoCongelato = ProdottoCongelato ? "Si" : "No";
        return super.toString() + "[Data scadenza" + dataScadenza + "congelato" + prodottoCongelato + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProdottoAlimentare that)) return false;
        return prodottoCongelato == that.prodottoCongelato && Objects.equals(dataScadenza, that.dataScadenza);
    }
}
