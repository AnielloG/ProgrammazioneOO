package ES12;

import java.util.Objects;

public abstract class Prodotto {
    private String codice;
    private String descrizioneProd;
    private int prezzo;
    private int quantitaDisponibili;

    public Prodotto(String codice,String descrizioneProd,int prezzo, int quantitaDisponibili){
        this.codice = codice;
        this.descrizioneProd = descrizioneProd;
        this.prezzo = prezzo;
        this.quantitaDisponibili = quantitaDisponibili;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizioneProd() {
        return descrizioneProd;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public int getQuantitaDisponibili() {
        return quantitaDisponibili;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setDescrizioneProd(String descrizioneProd) {
        this.descrizioneProd = descrizioneProd;
    }

    public void setQuantitaDisponibili(int quantitaDisponibili) {
        this.quantitaDisponibili = quantitaDisponibili;
    }

    public String toString(){
        return getClass().getName() +
                "[Codice prodotto" + codice +
                "Prezzo prodotto" + prezzo +
                "Descrizione del prodotto" + descrizioneProd +
                "quantità disponibile " + quantitaDisponibili +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prodotto prodotto)) return false;
        return prezzo == prodotto.prezzo && quantitaDisponibili == prodotto.quantitaDisponibili && Objects.equals(codice, prodotto.codice) && Objects.equals(descrizioneProd, prodotto.descrizioneProd);
    }
}
