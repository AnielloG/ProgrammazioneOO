package ES7PreProva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class Negozio {
    private final ArrayList<Capo> catalogo;

    public Negozio(){
        this.catalogo = new ArrayList<>();
    }
    public Negozio(Capo... capi){
        this.catalogo = new ArrayList<>();
        this.add(capi);
    }
    public void add(Capo... capi){
        this.catalogo.addAll(Arrays.asList(capi));
    }
    public void remove(Capo... capi){
        this.catalogo.removeAll(Arrays.asList(capi));
    }
}
