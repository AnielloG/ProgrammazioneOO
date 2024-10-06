package ES5;

import java.util.Date;

public class MedicinaleSperimentale extends Medicinale{
    private StatoAvanzamento statoAvanzamento;
    private int nGiorniSperimentazione;

    public MedicinaleSperimentale(String nome, String aziendaProduttrice, Date dataScadenza, int unitaDisponibili,int nGiorniSperimentazione){
        super(nome, aziendaProduttrice, dataScadenza, unitaDisponibili);
        this.statoAvanzamento = StatoAvanzamento.INIZIO;
        this.nGiorniSperimentazione = 0;
    }//costruttore per inizializzare attributoEnum a INIZIO

    public MedicinaleSperimentale(String nome, String aziendaProduttrice, Date dataScadenza, int unitaDisponibili,int nGiorniSperimentazione,StatoAvanzamento statoAvanzamento){
        super(nome, aziendaProduttrice, dataScadenza,unitaDisponibili);
        this.statoAvanzamento = statoAvanzamento;
        this.nGiorniSperimentazione = nGiorniSperimentazione;
    }

    public int getnGiorniSperimentazione() {
        return nGiorniSperimentazione;
    }
    public void setStatoAvanzamento(StatoAvanzamento statoAvanzamento) {
        this.statoAvanzamento = statoAvanzamento;
    }
    public StatoAvanzamento getStatoAvanzamento() {
        return statoAvanzamento;
    }
    public void setnGiorniSperimentazione(int nGiorniSperimentazione) {
        this.nGiorniSperimentazione = nGiorniSperimentazione;
    }
    public String toString(){
        return getClass().getName() + "[StatoAvanzamento" + statoAvanzamento + "numero giorni Sperimentazione" +
        nGiorniSperimentazione + super.toString() + "]";
    }
}
