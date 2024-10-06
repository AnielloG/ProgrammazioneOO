package ES9;

public class Squadra {
    private String nomeSquadra;
    private int nGiocatori;
    private String cittaProvenienza;
    private int annoFondazione;

    public Squadra(String nomeSquadra,int nGiocatori,String cittaProvenienza,int annoFondazione){
        this.nomeSquadra = nomeSquadra;
        this.nGiocatori = nGiocatori;
        this.cittaProvenienza = cittaProvenienza;
        this.annoFondazione = annoFondazione;
    }

    public String getNomeSquadra() {
        return nomeSquadra;
    }
    public int getnGiocatori() {
        return nGiocatori;
    }
    public String getCittaProvenienza() {
        return cittaProvenienza;
    }
    public int getAnnoFondazione() {
        return annoFondazione;
    }
    public void setNomeSquadra(String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
    }
    public void setnGiocatori(int nGiocatori) {
        this.nGiocatori = nGiocatori;
    }
    public void setCittaProvenienza(String cittaProvenienza) {
        this.cittaProvenienza = cittaProvenienza;
    }
    public void setAnnoFondazione(int annoFondazione) {
        this.annoFondazione = annoFondazione;
    }

    public String toString(){
        return "[nome Squadra" + nomeSquadra +
                "numero giocatori" + nGiocatori+
                "Città squadra" + cittaProvenienza +
                "Anno di fondazione" + annoFondazione + "]";
    }
}
