package ES4.punto2;
import ES4.punto1.Prodotto;
import ES4.punto1.Prodotto;

import java.util.ArrayList;
public class Container implements ContainerInterface{
    public static final double PESOMASSIMO = 150;
    private final ArrayList<Prodotto> prodotti;
    private double pesoTotale;

    public Container(){
        this.prodotti = new ArrayList<>();
        this.pesoTotale = 0;
    }

    public Container(Prodotto... prodotti){
        this.prodotti = new ArrayList<>();
        this.pesoTotale = 0;
        for (Prodotto p : prodotti)
            addProdotto(p);
    }
    public ArrayList<Prodotto> getProdotti(){return prodotti;}

    public ArrayList<Prodotto>getByPeso(double min,double max){
        var ret = new ArrayList<Prodotto>();
        for (Prodotto p :prodotti){
            if(p.getPeso() >= min && p.getPeso() <= max)
                ret.add(p);
        }
        return ret;
    }
    public void addProdotto(Prodotto p){
        if(!prodotti.contains(p)){
            if(pesoTotale + p.getPeso() <= Container.PESOMASSIMO){
                prodotti.add(p);
                pesoTotale += p.getPeso();
            }
        }
    }
    public Prodotto removeProdotto(Prodotto p){
        int index =prodotti.indexOf(p);
        if (index != -1){
            pesoTotale -= p.getPeso();
            return prodotti.remove(index);
        }
        return null;
    }
}
