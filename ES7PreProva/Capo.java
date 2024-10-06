package ES7PreProva;

public abstract class Capo {
    private String nome;
    private String marca;
    private int prezzo;
    private String taglia;
    private boolean disponibile;
    private int id;
    private int cont=0;

    public Capo(boolean disponibile, String marca, int prezzo, String taglia, String nome){
        if (prezzo < 0) throw new RuntimeException("Prezzo non valido");
        this.disponibile = disponibile;
        this.taglia = taglia;
        this.marca = marca;
        this.prezzo = prezzo;
        this.nome = nome;
        this.id = cont++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    @Override
    public String toString() {
        return "Capo{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", prezzo=" + prezzo +
                ", taglia='" + taglia + '\'' +
                ", disponibile=" + disponibile +
                ", id=" + id +
                ", cont=" + cont +
                '}';
    }
}
