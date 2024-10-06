package ES4.punto2;

import ES4.punto1.Prodotto;

import java.util.ArrayList;

public interface ContainerInterface {
    ArrayList<Prodotto> getByPeso(double min, double max);
    public void addProdotto(Prodotto p);
    public Prodotto removeProdotto(Prodotto p);
}
