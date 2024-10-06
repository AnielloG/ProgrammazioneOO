package ES2;
import java.util.HashMap;
public class Pizzeria extends Locale{
    private final HashMap<String, Double> menu;

    public Pizzeria(String nome,String indirizzo, int postiDisponibili){
        super(nome,indirizzo,postiDisponibili);
        this.menu = new HashMap<>();
    }

    public boolean addPizza(String nomePizza,double prezzo) {
        return menu.putIfAbsent(nomePizza,prezzo) == null;
    }
    public boolean removePizza(String nomePizza){
        return menu.remove(nomePizza) != null;
    }
    public boolean isPizza(String nomePizza){
        return menu.containsKey(nomePizza);
    }

    @Override
    public String toString(){
        return "Pizzeria{"+
                super.toString() +
                "menu"+ menu+
                '}';
    }
}
