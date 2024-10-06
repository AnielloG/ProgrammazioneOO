package ES4.punto1;
public class Ente {
    private String nome;
    private String indirizzo;
    //costruttore
    public Ente (String nome,String indirizzo){
        this.indirizzo = indirizzo;
        this.nome = nome;
    }
    //getter e setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String toString()
    { return getClass().getName() + "[nome" + nome + "indirizzo" + indirizzo + "}";}

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        Ente e = (Ente) o;
        return nome.equals(e.nome) && indirizzo.equals(e.indirizzo);
    }
}
