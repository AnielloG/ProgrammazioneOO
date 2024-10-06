package ES2;
import java.util.HashMap;
public class GestioneRistoranti implements LocaleOptions, GestioneRistorantiInterface {
    private final HashMap<String, Locale> locali;
    public GestioneRistoranti (Locale... locali){
        this.locali = new HashMap<>();
        for (var l : locali) {
            this.addLocale(l);
        }
    }

    @Override
    public void addLocale(Locale l) {
        this.locali.putIfAbsent(l.getNome(), l);
    }
    @Override
    public boolean prenota(String nomeLocale, int numeroPersone) {
        Locale l = this.locali.get(nomeLocale);
        if (l.getPostiDisponibili() > numeroPersone){
            if (l instanceof Paninoteca && ((Paninoteca)l).getNumeroPanini() > numeroPersone) {
                ((Paninoteca) l).modNumeroBirre(-numeroPersone);
                ((Paninoteca) l).modNumeroPanini(-numeroPersone);
            }
            l.modPostiDisponibili(-numeroPersone);
            return true;
        }
        return false;
    }
    @Override
    public void printAllInfo() {
        for (var l : locali.values()) {
            System.out.println(l);
        }
    }
    @Override
    public void printPizzerieByPizza(String pizza) {
        for (var l : locali.values()){
            if (l instanceof Pizzeria){
                if (((Pizzeria) l).isPizza(pizza)) {
                    System.out.println(l);
                }
            }
        }
    }
}
