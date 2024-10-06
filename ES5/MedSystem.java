package ES5;

import java.io.*;
import java.util.*;

public class MedSystem implements Serializable{
    private List<Medicinale> medicinali;

    public MedSystem(Medicinale... medicinali){
        this.medicinali = new ArrayList<>();
        this.medicinali.addAll(Arrays.asList(medicinali));
    }
    public void addMedicinali(Medicinale medicinale){
        medicinali.add(medicinale);
    }
    public void removeMedicinali(Medicinale medicinale){
        medicinali.remove(medicinale);
    }
    public List<Medicinale> getMedicinali(){
        return medicinali;
    }
    public void stampaMedicinaliScadutiDiUnaAzienda(){
        medicinali.stream()
                .filter(medicinali -> medicinali.getDataScadenza().before(new Date()) &&
                        medicinali.getAziendaProduttrice().equalsIgnoreCase(medicinali.getAziendaProduttrice()))
                .forEach(System.out::println);
    }
    public void stampaContatoreFarmaciSperimentaliIntermedi(){
        long count = medicinali.stream()
                .filter(medicinale -> medicinale instanceof MedicinaleSperimentale &&
                        ((MedicinaleSperimentale) medicinale).getStatoAvanzamento() == StatoAvanzamento.INTERMEDIO)
                .count();
        System.out.println("Il numero di medicinali sperimentali di fase INTERMEDIA è: " + count);
    }
    public void stampaMinMaxdiunita(){
        int max = medicinali.stream()
                .mapToInt(Medicinale::getUnitaDisponibili)
                .max()
                .orElse(0);
        int min = medicinali.stream()
                .mapToInt(Medicinale::getUnitaDisponibili)
                .min()
                .orElse(0);
        System.out.println("Numero massimo di unità disponibili" + max);
        System.out.println("Numero minimo di unità disponibili" + min);
    }
    public void stampaMedicinaliOrdineAlfabetico(){
        medicinali.stream()
                .sorted(Comparator.comparing(Medicinale::getNome))
                .forEach((System.out::println));
    }
    public void saveToFile(String path){
        try (FileOutputStream fileOut = new FileOutputStream(path);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(medicinali);
            System.out.println("I dati serializzati sono stati salvati in"+path);
        } catch (FileNotFoundException e){
            System.err.println("File not Found");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public void loadFromFile(String path){
        try {FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            medicinali = (ArrayList<Medicinale>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("I dati serializzati sono stati salvati in" + path);
        }catch (FileNotFoundException e){
            System.err.println("File not found");
        }catch (ClassNotFoundException c) {
            System.out.println("Classe non trovata");
            c.printStackTrace();
        }catch (IOException i){
            throw new RuntimeException(i);

        }
    }
}
