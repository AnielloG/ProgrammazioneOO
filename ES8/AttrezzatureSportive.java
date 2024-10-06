package ES8;
import java.util.ArrayList;
public abstract class AttrezzatureSportive {
    protected ArrayList<AttrezzatureSportive> attrezzature;

    public AttrezzatureSportive() {
        this.attrezzature = new ArrayList<>();
    }
    public void addAttrezzatureSportive(AttrezzatureSportive attrezzatura){
        attrezzature.add(attrezzatura);
    }
    public void removeAttrezzatureSportive(AttrezzatureSportive attrezzatura){
        attrezzature.remove(attrezzatura);
    }
    public void modificaAttrezzaturaSportive(int indice,AttrezzatureSportive attrezzatura){
        attrezzature.set(indice,attrezzatura);
    }
}
