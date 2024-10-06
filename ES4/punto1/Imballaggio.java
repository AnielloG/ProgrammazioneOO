package ES4.punto1;

public class Imballaggio extends Peso{
    private double dimensioni;

    public Imballaggio(double dimensioni,double peso){
        super(peso);
        this.dimensioni = dimensioni;
    }

    public double getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(double dimensioni) {
        this.dimensioni = dimensioni;
    }
    public String toString() {
        return getClass().getName() + "[dimensione=" + dimensioni + ",peso=" + getPeso() + "]";
    }

    public boolean equals(Object o) {
        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        Imballaggio i = (Imballaggio) o;
        return dimensioni == i.dimensioni && i.getPeso() == getPeso();
    }
}
