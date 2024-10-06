package ES4.punto3;

import ES4.punto1.Certificato;
import ES4.punto1.Ente;
import ES4.punto1.Imballaggio;
import ES4.punto1.ProdottoInSpedizione;
public class Tester {
    public static void main(String[] args){
        ProdottoInSpedizione p = new ProdottoInSpedizione(
                new Certificato(new Ente("A","B"),"descrizione"),
                "denomin",
                12.5,
                new Imballaggio(12.0,12.5),
                "indirizzo"
        );
    }
}
