package ES10;

public class Primo extends Piatto{
    private String tipoDiPasta;
    private int tempoDiCottura;

    public Primo(String nomePiatto,String descrizione,int prezzo,int tempoDiPreparazione,boolean disponibile,String tipoDiPasta, int tempoDiCottura){
        super(nomePiatto,descrizione,prezzo,tempoDiPreparazione,disponibile);
        this.tipoDiPasta = tipoDiPasta;
        this.tempoDiCottura = tempoDiCottura;
    }

    public String getTipoDiPasta() {
        return tipoDiPasta;
    }
    public int getTempoDiCottura() {
        return tempoDiCottura;
    }
    public void setTipoDiPasta(String tipoDiPasta) {
        this.tipoDiPasta = tipoDiPasta;
    }
    public void setTempoDiCottura(int tempoDiCottura) {
        this.tempoDiCottura = tempoDiCottura;
    }
    public String toString(){
        return super.toString().getClass().getName() + "Tipo pasta" + tipoDiPasta +
                "Tempo di cottura "+ tempoDiCottura;
    }
}
