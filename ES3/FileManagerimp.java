package ES3;
import java.io.*;
import java.util.List;
public class FileManagerimp implements FileManager {
    @Override
    public void readDipendenti(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Processa ogni linea come lavoratore e aggiungi alla lista dei lavoratori
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void saveDipendenti(String filename, List<Dipendente> dipendente) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Dipendente lavoratore : dipendente) {
                // Scrivi il dipendente nel file
                bw.write(lavoratore.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void stampaDipendentiConSalarioMaggioreDi(List<Dipendente> dipendenti, double soglia){
        for (Dipendente dipendente : dipendenti) {
            if (dipendente.getSalario() > soglia) {
                System.out.println(dipendente);
            }
        }
    }
}
