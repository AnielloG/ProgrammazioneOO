package ES5;

import java.io.Serializable;
import java.util.Date;
public class Medicinale implements Serializable {
    private String nome;
    private String aziendaProduttrice;
    private Date dataScadenza;
    private int unitaDisponibili;

    public Medicinale(String nome,String aziendaProduttrice,Date dataScadenza,int unitaDisponibili){
        this.nome = nome;
        this.aziendaProduttrice = aziendaProduttrice;
        this.dataScadenza = dataScadenza;
        this.unitaDisponibili = unitaDisponibili;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAziendaProduttrice() {
        return aziendaProduttrice;
    }
    public void setAziendaProduttrice(String aziendaProduttrice) {
        this.aziendaProduttrice = aziendaProduttrice;
    }
    public Date getDataScadenza() {
        return dataScadenza;
    }
    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }
    public int getUnitaDisponibili() {
        return unitaDisponibili;
    }
    public void setUnitaDisponibili(int unitaDisponibili) {
        this.unitaDisponibili = unitaDisponibili;
    }
    public String toString(){
        return getClass().getName() + "[nome farmaco" + nome
                + "aziendaProduttrice" + aziendaProduttrice + "data scadenza" + dataScadenza + "numero unità disponibili" + unitaDisponibili + "]";
    }
}
