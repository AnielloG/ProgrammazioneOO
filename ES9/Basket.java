package ES9;

public class Basket extends Squadra{
    private String allenatore;
    private String arena;
    private int titoliNBA;

    public Basket(String allenatore,String arena, int titoliNBA,String nomeSquadra,int nGiocatori,String cittaProvenienza,int annoFondazione){
        super(nomeSquadra, nGiocatori, cittaProvenienza, annoFondazione);
        this.allenatore = allenatore;
        this.arena = arena;
        this.titoliNBA = titoliNBA;
    }

    public String getAllenatore() {
        return allenatore;
    }
    public int getTitoliNBA() {
        return titoliNBA;
    }
    public String getArena() {
        return arena;
    }
}
