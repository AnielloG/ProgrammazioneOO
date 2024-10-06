package ES9;

public class Pallavolo extends Squadra{
    private String allenatore;
    private String palazzetto;
    private int titoliA1;

    public Pallavolo(String allenatore,String palazzetto, int titoliA1,String nomeSquadra,int nGiocatori,String cittaProvenienza,int annoFondazione){
        super(nomeSquadra, nGiocatori, cittaProvenienza, annoFondazione);
        this.allenatore = allenatore;
        this.palazzetto = palazzetto;
        this.titoliA1 = titoliA1;
    }

    public String getAllenatore() {
        return allenatore;
    }
    public String getPalazzetto() {
        return palazzetto;
    }
    public int getTitoliA1() {
        return titoliA1;
    }
}
