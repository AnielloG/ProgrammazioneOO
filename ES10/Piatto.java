package ES10;

public class Piatto {
    private String nomePiatto;
    private String descrizione;
    private int prezzo;
    private int tempoDiPreparazione;
    private boolean disponibile;

    public Piatto(String nomePiatto,String descrizione,int prezzo,int tempoDiPreparazione,boolean disponibile){
        this.nomePiatto = nomePiatto;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.tempoDiPreparazione = tempoDiPreparazione;
        this.disponibile = disponibile;
    }

    public String getNomePiatto() {
        return nomePiatto;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public int getTempoDiPreparazione() {
        return tempoDiPreparazione;
    }
    public boolean isDisponibile() {
        return disponibile;
    }

    public void setNomePiatto(String nomePiatto) {
        this.nomePiatto = nomePiatto;
    }
    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public void setTempoDiPreparazione(int tempoDiPreparazione) {
        this.tempoDiPreparazione = tempoDiPreparazione;
    }
}
