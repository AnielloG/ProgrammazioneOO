package ES11SquadraCalcio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Test {
    public static void main(String[] args)  {
        ArrayList<Giocatori> giocatore = new ArrayList<>();
        Squadra squadra = new Squadra();

        Giocatori giocatore1 = new Giocatori(1,"Sergio",28,200000);

        try {
            squadra.Aggiungi(giocatore1);
            System.out.println("Giocatore aggiunto con successo");
        }catch (GiocatoreEsistenteException e){
            System.err.println(e.getMessage());
        }

    }

    public void StampaCartellino(){
         giocatore.stream()
                .mapToInt(Giocatori::getCodiceCartellino)
                .forEach(System.out::println);
    }
    public long EstraiDatiDaGiocatore(){
        long count = Giocatori.stream()
                .filter(e -> e.getEta() < 24 && e.getStipendio() > 100000)
                .count();
    }
    public void ScritturaSuFile(ArrayList<Giocatori> giocatori,String nomeFile){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))){
            for(Giocatori giocatore : giocatori){
                writer.write(giocatore.toString());
                writer.newLine();
            }
            System.out.println("Scrittura Eseguita");
        } catch (IOException e){
            System.err.println("Errore durante la scrittura su File" + e.getMessage());
        }
    }
}
