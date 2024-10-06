package ES13GiocoFantasy;

public interface PersMaster {
    void Ruota(int g);
    void Avanti(int s) throws LimiteException;
    void Indietro(int s) throws LimiteException;
}
