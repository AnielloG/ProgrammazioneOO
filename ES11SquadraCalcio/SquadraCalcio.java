package ES11SquadraCalcio;

public interface SquadraCalcio {
    void Aggiungi(Giocatori g) throws GiocatoreEsistenteException;
    void Rimuovi (Giocatori g) throws GiocatoreNonEsistenteException;
}
