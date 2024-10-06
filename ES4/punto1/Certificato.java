package ES4.punto1;

public class Certificato {
    private final Ente ente;
    private final String descrizione;

    public Certificato(Ente ente, String descrizione) {
        this.ente = ente;
        this.descrizione = descrizione;
    }

    public Ente getEnte() {
        return ente;
    }

    public String getDescrizione() {
        return descrizione;
    }
    public String toString()
    { return getClass().getName() + "[Ente"+ ente + "descrizione" + descrizione + "]";}

    public boolean equals(Object o) {
        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        Certificato c = (Certificato) o;
        return ente.equals(c.ente) && descrizione.equals(c.descrizione);
    }
}
