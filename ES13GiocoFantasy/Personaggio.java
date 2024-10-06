package ES13GiocoFantasy;

public abstract class Personaggio {
    private static int count = 0;
    private int id;
    private Tipo tipoPersonaggio;
    private int energia;
    private double posizioneIniziale;
    private double posizioneDurante;

    public Personaggio(Tipo tipoPersonaggio,int energia,double posizioneIniziale, double posizioneDurante) {
        this.id = count++;
        this.tipoPersonaggio = tipoPersonaggio;
        this.energia = energia;
        this.posizioneIniziale = posizioneIniziale;
        this.posizioneDurante = posizioneDurante;
    }

    public int getId() {
        return id;
    }
    public Tipo getTipoPersonaggio() {
        return tipoPersonaggio;
    }
    public int getEnergia() {
        return energia;
    }
    public double getPosizioneIniziale() {
        return posizioneIniziale;
    }
    public double getPosizioneDurante() {
        return posizioneDurante;
    }
    public void setTipoPersonaggio(Tipo tipoPersonaggio) {
        this.tipoPersonaggio = tipoPersonaggio;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public void setPosizioneIniziale(double posizioneIniziale) {
        this.posizioneIniziale = posizioneIniziale;
    }
    public void Colpisci(Personaggio p){
        int EnergiaNuova = p.getEnergia();
        p.setEnergia(EnergiaNuova - 1);
    }
    public void setPosizioneDurante(double posizioneDurante) {
        this.posizioneDurante = posizioneDurante;
    }
    @Override
    public String toString() {
        return "Personaggio{" +
                "id=" + id +
                ", tipoPersonaggio=" + tipoPersonaggio +
                ", energia=" + energia +
                ", posizioneIniziale=" + posizioneIniziale +
                ", posizioneDurante=" + posizioneDurante +
                '}';
    }
}
