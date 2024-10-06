package ES10;

import java.util.ArrayList;
import java.util.List;

public class Antipasto extends Piatto{
    private List<String>  ingredientiPrincipali = new ArrayList<>();
    private int porzioniConsigliate;
    private static int gradoDiPiccantezza;

    public Antipasto(String nomePiatto,String descrizione,int prezzo,int tempoDiPreparazione,boolean disponibile,List ingredientiPrincipali,int porzioniConsigliate,int gradoDiPiccantezza){
        super(nomePiatto,descrizione,prezzo,tempoDiPreparazione,disponibile);
        this.porzioniConsigliate = porzioniConsigliate;
        this.gradoDiPiccantezza = gradoDiPiccantezza;
    }

    public List<String> getIngredientiPrincipali() {
        return ingredientiPrincipali;
    }
    public int getPorzioniConsigliate() {
        return porzioniConsigliate;
    }
    public static int getGradoDiPiccantezza() {
        return gradoDiPiccantezza;
    }
    public void setIngredientiPrincipali(List<String> ingredientiPrincipali) {
        this.ingredientiPrincipali = ingredientiPrincipali;
    }
    public void setPorzioniConsigliate(int porzioniConsigliate) {
        this.porzioniConsigliate = porzioniConsigliate;
    }
    public void setGradoDiPiccantezza(int gradoDiPiccantezza) {
        this.gradoDiPiccantezza = gradoDiPiccantezza;
    }

    @Override
    public String toString(){
        return super.toString().getClass().getName() + "ingredienti Principali" + ingredientiPrincipali +
                "porzioni consigliate" + porzioniConsigliate + "grado di piccantezza" +gradoDiPiccantezza;
    }


    }
}
