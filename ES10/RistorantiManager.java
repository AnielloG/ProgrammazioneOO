package ES10;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class RistorantiManager {
    private ArrayList<Piatto> menu;

    public RistorantiManager(){
        this.menu = new ArrayList<>();
    }
    public void addPiatto(Piatto piatto){
        this.menu.add(piatto);
    }
    public void removePiatto(Piatto piatto){
        this.menu.remove(piatto);
    }
    public ArrayList<Piatto> getMenu(){
        return menu;
    }
    public void AntipastiPiuPiccanti(){
        menu.stream()
                .filter(e -> e instanceof Antipasto)
                .map(e -> (Antipasto) e)
                //sorted(Antipasto::Comparator.compareTo)
                .forEach(System.out::println);
    }
    //implementare Stream API
}
