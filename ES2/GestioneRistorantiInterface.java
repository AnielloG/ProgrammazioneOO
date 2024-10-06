package ES2;

public interface GestioneRistorantiInterface {
        public static GestioneRistoranti createManager() {
            Pizzeria a = new Pizzeria("Antonio","Via armando diaz 175",3);
            Pizzeria b = new Pizzeria("Gino","Via Roma 175",2);
            Pizzeria c = new Pizzeria("Ciro","Via XX Settembre 175",5);

            a.addPizza("Margherita", 5);
            b.addPizza("Margherita", 5);
            c.addPizza("Margherita", 5);

            Paninoteca d = new Paninoteca("Lupin","San Giuseppe Ves",20,50,50);

            return new GestioneRistoranti (a,b,c,d);
        }
        public void printPizzerieByPizza(String pizza);
}
