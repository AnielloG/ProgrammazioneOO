package ES4.punto1;

public abstract class Peso {
    private double peso;
    private final Tipo t;

    public Peso(double peso) { //costruttore che prende peso in input e assegna a tipo KG come standard
        this.t = Tipo.KG;
        this.peso = peso;
    }
    public Peso(double peso, Tipo t){ //costruttore "classico" che prende peso e tipo in input
        this.peso = peso;
        this.t = t;
    }

    public double getPeso() {
        return peso;
    }

    public Tipo getT() {
        return t;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void modPeso(double peso){this.peso += peso;}

    @Override
    public String toString() {
        return "Peso{" +
                "peso=" + peso +
                ", t=" + t +
                '}';
    }
}
