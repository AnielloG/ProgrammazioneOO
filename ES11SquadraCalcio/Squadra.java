package ES11SquadraCalcio;

import java.util.List;
import java.util.ArrayList;

public class Squadra extends ListaGiocatori{

    public Squadra(int codiceSquadra, String nomeSquadra, campionato tipoCampionato, int annoCampionato, int nMaxGiocatori, List<Giocatori> giocatori, int contatoreGiocatori){
        super(codiceSquadra,nomeSquadra, tipoCampionato, annoCampionato,nMaxGiocatori,giocatori,contatoreGiocatori);
    }
    public void Aggiungi(Giocatori g) throws GiocatoreEsistenteException {
        if(giocatori.contains(g)){
            throw new GiocatoreEsistenteException("il giocatore è già presente nella lista");
        }
        this.giocatori.add(g);
    }
    public void Rimuovi(Giocatori g)throws GiocatoreNonEsistenteException{
        if(!giocatori.contains(g)){
            throw new GiocatoreNonEsistenteException("Il giocatore è già stato rimosso dalla lista");
        }
        this.giocatori.remove(g);
    }

}
