package ES8;
import java.util.ArrayList;
import java.util.Date;
public class MembriPaestra {
private String idMembro;
private String nome;
private String cognome;
private Date dataDiNascita;
private int nTelefono;
protected ArrayList<MembriPaestra> membri;

    public MembriPaestra(String idMembro,String nome, String cognome, Date dataDiNascita, int nTelefono,ArrayList<MembriPaestra> membri){
        this.idMembro = idMembro;
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.nTelefono = nTelefono;
        this.membri = new ArrayList<>();
    }
    public void aggiungiMembro(MembriPaestra membro) {
        membri.add(membro);
    }
    public void rimuoviMembro(String idMembro) {
        // Cerca il membro con l'id specificato
        for (MembriPaestra membro : membri) {
            if (membro.getIdMembro().equals(idMembro)) {
                membri.remove(membro); // Rimuovi il membro dalla lista
                break; // Esci dal ciclo una volta che il membro è stato rimosso
            }
        }
    }
    public String getIdMembro() {
        return idMembro;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public Date getDataDiNascita() {
        return dataDiNascita;
    }
    public int getnTelefono() {
        return nTelefono;
    }
    public void setIdMembro(String idMembro) {
        this.idMembro = idMembro;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    public void setnTelefono(int nTelefono) {
        this.nTelefono = nTelefono;
    }
    public void prestitoAttrezzatura(AttrezzatureSportive attrezzatura, Date dataPrestito){
        if(attrezzatura.isStato()){

        }
    }
}
