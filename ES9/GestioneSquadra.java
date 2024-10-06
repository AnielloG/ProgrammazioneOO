package ES9;
import java.util.*;
import java.util.stream.Collectors;

public class GestioneSquadra {
    protected static ArrayList<Squadra> squadre;

    public GestioneSquadra(){
        this.squadre = new ArrayList<>();
    }
    public static void aggiungiSquadre(Squadra squadra){
        squadre.add(squadra);
    }
    public static void rimuoviSquadra(Squadra squadra){
        squadre.remove(squadra);
    }
    public static void stampaSquadre(){
        for(Squadra squadra : squadre){
            System.out.println(squadra.toString());
        }
    }
    public static long contaSquadrabyIniziale(char iniziale){
        return squadre.stream()
                .filter(s -> s.getNomeSquadra().charAt(0) == iniziale)
                .count();
    }
    public static void trovaSquadreMinMaxGiocatori(){
        Squadra minGiocatori = squadre.stream()
                .min(Comparator.comparingInt(Squadra::getnGiocatori))
                .orElse(null);
        Squadra maxGiocatori = squadre.stream()
                .max(Comparator.comparingInt(Squadra::getnGiocatori))
                .orElse(null);

        System.out.println("La squadra con il numero minimo di giocatori ha" + minGiocatori);
        System.out.println("La squadra con il numero massimo di giocatori ha" + maxGiocatori);
    }
    public static void stampaSquadraPerCitta(String citta){
        squadre.stream()
                .filter(s->s.getCittaProvenienza().equalsIgnoreCase(citta))
                .map(Squadra::getNomeSquadra)
                .forEach(System.out::println);
    }
    public static double mediaNumeroGiocatori(){
        return squadre.stream()
                .mapToInt(Squadra::getnGiocatori)
                .average()
                .orElse(0.0);
    }
    public static void stampaNomiSquadreOrdineAlfabetico(){
        squadre.stream()
                .map(Squadra::getNomeSquadra)
                .sorted()
                .forEach(System.out::println);
    }
    public static int sommaNumGiocatori(){
        return squadre.stream()
                .mapToInt(Squadra::getnGiocatori)
                .sum();
    }
    public static List<Squadra> squadreconNumeroDiGiocatoriMaggioriDi(int soglia){
        return squadre.stream()
                .filter(s-> s.getnGiocatori() > soglia)
                .collect(Collectors.toList());
    }
    public static Optional<Squadra> SquadraConNomePiuLungo(){
        return squadre.stream()
                .max(Comparator.comparingInt(s -> s.getNomeSquadra().length()));
    }
}
