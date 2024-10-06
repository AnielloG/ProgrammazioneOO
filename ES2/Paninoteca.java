package ES2;
public class Paninoteca extends Locale{
    private int numeroBirre;
    private int numeroPanini;

    public Paninoteca(String nome, String Indirizzo, int postiDisponibili, int numeroBirre, int numeroPanini){
        super(nome,Indirizzo,postiDisponibili);
        this.numeroBirre = numeroBirre;
        this.numeroPanini = numeroPanini;
    }

    public void modNumeroBirre(int numeroBirre){this.numeroBirre += numeroBirre;}
    public void modNumeroPanini(int numeroPanini){this.numeroPanini += numeroPanini;}

    public int getNumeroBirre(){return numeroBirre;}
    public void setNumeroBirre(int numeroBirre) {
        this.numeroBirre = numeroBirre;
    }
    public int getNumeroPanini(){return numeroPanini;}
    public void setNumeroPanini(int numeroPanini) {
        this.numeroPanini = numeroPanini;
    }
    @Override
    public String toString(){
        return "Paninotecs{" +
                super.toString() +
                "NumeroBirre=" + numeroBirre +
                "Numero Panini=" + numeroPanini +
                '}';
    }
}
