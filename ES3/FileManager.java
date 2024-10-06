package ES3;
import java.util.List;
public interface FileManager {
    void readDipendenti(String filename);
    void saveDipendenti(String filename, List<Dipendente> dipendente);
    void stampaDipendentiConSalarioMaggioreDi(List<Dipendente> lavoratori, double soglia);
}
