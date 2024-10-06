package ES9;

public class Calcio extends Squadra{
    private String allenatore;
    private String stadio;
    private int titoliSerieA;

    public Calcio(String allenatore,String stadio, int titoliSerieA,String nomeSquadra,int nGiocatori,String cittaProvenienza,int annoFondazione){
        super(nomeSquadra, nGiocatori, cittaProvenienza, annoFondazione);
        this.allenatore = allenatore;
        this.stadio = stadio;
        this.titoliSerieA = titoliSerieA;
    }
    public String getAllenatore() {
        return allenatore;
    }
    public String getStadio() {
        return stadio;
    }
    public int getTitoliSerieA() {
        return titoliSerieA;
    }
}
