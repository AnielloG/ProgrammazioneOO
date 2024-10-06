package ES9;

import java.util.List;

public class Tester {
    public static void main(String[] args){
        Squadra s = new Calcio("Calzona","Diego Armando Maradona", 3,"SSC Napoli", 30,"Napoli",1926);
        GestioneSquadra.aggiungiSquadre(s);
        Squadra s1 = new Basket("Pepp","LAArena",5,"LALakers",35,"LosAngeles",1990);
        GestioneSquadra.aggiungiSquadre(s1);
        Squadra s2 = new Pallavolo("Antonio","Palazzetto di Napoli", 3,"Napoli pallavolo", 30,"Napoli",1926);
        GestioneSquadra.aggiungiSquadre(s2);

        System.out.println("Stampa di tutte le squadre presenti nella collection");
        GestioneSquadra.stampaSquadre();

        char iniziale = 'A';
        long SquadraByIniziale = GestioneSquadra.contaSquadrabyIniziale(iniziale);

        GestioneSquadra.trovaSquadreMinMaxGiocatori();

        GestioneSquadra.stampaNomiSquadreOrdineAlfabetico();

        int sommaNumeriGiocatori = GestioneSquadra.sommaNumGiocatori();
        System.out.println("la somma di tutti i giocatori è " + sommaNumeriGiocatori);

        int soglia = 20;
        List<Squadra> List = GestioneSquadra.squadreconNumeroDiGiocatoriMaggioriDi(soglia);

        String citta = "Napoli";
        System.out.println("la squadra che inizia per " + citta);
        GestioneSquadra.stampaSquadraPerCitta(citta);

        double mediaNumeroGiocatoi = GestioneSquadra.mediaNumeroGiocatori();
        System.out.println("la media dei giocatori è" + mediaNumeroGiocatoi);


    }
}
