package ES13GiocoFantasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Gestore implements PersMaster {
    private ArrayList<Personaggio> ListaPersonaggi;

    //creazione quadrato di gioco


    public Gestore(Personaggio... personaggio) {
        ListaPersonaggi = new ArrayList<>();
        ListaPersonaggi.addAll(Arrays.asList(personaggio));
    }

    public void Ruota(int g) {
        //metodo vero e proprio
    }

    public void Avanti(int s) throws LimiteException {
        //metodo vero e proprio
        if (s > 100) {
            throw new LimiteException("S");
        }
    }
    public void Indietro() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Inserisci il valore di s: ");
            int s = scanner.nextInt();
            Indietro(s); // Chiamata al metodo Indietro passando il valore s inserito dall'utente
        } catch (java.util.InputMismatchException e) {
            System.err.println("Input non valido. Inserisci un intero.");
        } catch (LimiteException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }
    }

    public void Indietro(int s) throws LimiteException {
        //metodo vero e proprio
        if (s > 100) {
            throw new LimiteException("S");
        }
    }

    public void getPos(Personaggio p) {
        p.getPosizioneDurante();
    }

    public void getPosTutti(Personaggio p) {
        try {
            for (Personaggio personaggio : ListaPersonaggi) {
                p.getId();
                p.getPosizioneDurante();
            }
        } catch (Exception e) {
            System.err.println("ERRORE");
        }
    }

    public void returnPersonaggio(Personaggio p) {
        Tipo tipo = p.getTipoPersonaggio();

        if (tipo == Tipo.Orco) {
            System.out.println("il personaggio in input è un orco ");
        } else {
            System.out.println("il personaggio preso in input è un Cavaliere");
        }
    }

    public void IDOrco() throws OrcoNotFoundExp {
        {
            ListaPersonaggi.stream()
                    .filter(e -> e instanceof Orco)
                    .mapToInt(e -> ((Orco) e).getId())
                    .forEach(System.out::println);
        } throw new OrcoNotFoundExp("Errore");
    }
    }

