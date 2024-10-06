package ES11SquadraCalcio;

public class Giocatori {
    private int codiceCartellino;
    private String nome;
    private int eta;
    private int stipendio;

    public Giocatori(int codiceCartellino, String nome, int eta,int stipendio){
        this.codiceCartellino = codiceCartellino;
        this.nome = nome;
        this.eta = eta;
        this.stipendio = stipendio;
    }
    public int getCodiceCartellino() {
        return codiceCartellino;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setCodiceCartellino(int codiceCartellino) {
        this.codiceCartellino = codiceCartellino;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }
}
