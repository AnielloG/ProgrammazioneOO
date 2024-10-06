package ES11SquadraCalcio;

import java.util.ArrayList;
import java.util.List;

public abstract class ListaGiocatori implements SquadraCalcio{
    private int codiceSquadra;
    private String nomeSquadra;
    private campionato tipoCampionato;
    private int annoCampionato;
    private int nMaxGiocatori;
    public ArrayList<Giocatori> giocatori;
    private int contatoreGiocatori;

    public ListaGiocatori(int codiceSquadra,String nomeSquadra, campionato tipoCampionato,int annoCampionato, int nMaxGiocatori,List<Giocatori> giocatori, int contatoreGiocatori){
        this.codiceSquadra = codiceSquadra;
        this.nomeSquadra = nomeSquadra;
        this.tipoCampionato = tipoCampionato;
        this.annoCampionato = annoCampionato;
        this.nMaxGiocatori = nMaxGiocatori;
        this.contatoreGiocatori = 0;
        this.giocatori = new ArrayList<>();
    }
    public String getNomeSquadra() {
        return nomeSquadra;
    }
    public int getCodiceSquadra() {
        return codiceSquadra;
    }
    public campionato getTipoCampionato() {
        return tipoCampionato;
    }
    public int getAnnoCampionato() {
        return annoCampionato;
    }
    public int getContatoreGiocatori() {
        return contatoreGiocatori;
    }
    public int getnMaxGiocatori() {
        return nMaxGiocatori;
    }

    public void setNomeSquadra(String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
    }
    public void setCodiceSquadra(int codiceSquadra) {
        this.codiceSquadra = codiceSquadra;
    }
    public void setTipoCampionato(campionato tipoCampionato) {
        this.tipoCampionato = tipoCampionato;
    }
    public void setnMaxGiocatori(int nMaxGiocatori) {
        this.nMaxGiocatori = nMaxGiocatori;
    }
    public void setContatoreGiocatori(int contatoreGiocatori) {
        this.contatoreGiocatori = contatoreGiocatori;
    }
    public void setAnnoCampionato(int annoCampionato) {
        this.annoCampionato = annoCampionato;
    }
    public void incrementaCont(){
        contatoreGiocatori++;
    }
    public void Modifica(int nuovoNumeroMaxGiocatori){
        setnMaxGiocatori(nuovoNumeroMaxGiocatori);
    }

}
