package ES2;
public abstract class Locale {
    private String nome;
    private String indirizzo;
    private int postidisponibili;

    //costruttore
    public Locale(String nome, String indirizzo, int postidisponibili) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.postidisponibili = postidisponibili;
    }
    //getter e setter
    public String getNome() {
        return nome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public int getPostiDisponibili() {
        return postidisponibili;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public void setPostidisponibili(int postidisponibili) {
        this.postidisponibili = postidisponibili;
    }
    public void modPostiDisponibili(int postidisponibili) {
        this.postidisponibili += postidisponibili;
    }

    @Override
    public String toString() {
        return "Locale{" +
                "nome='" + nome + '\''+
                "indirizzo=" +indirizzo +'\''+
                "postiDisponibili=" + postidisponibili +
                '}';
    }
}

