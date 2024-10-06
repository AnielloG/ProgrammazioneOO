package ES2;

public class Tester {
    public static void main(String[] args) {
        GestioneRistoranti g = GestioneRistorantiInterface.createManager();
        g.printPizzerieByPizza("margherita");
    }
}
