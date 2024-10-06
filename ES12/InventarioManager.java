package ES12;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.io.PrintWriter;
import java.io.Serializable;

public class InventarioManager {
        private ArrayList<Prodotto> prodotti = new ArrayList<>();

        public void Aggiungi(Prodotto prodotto){
            this.prodotti.add(prodotto);
            incrementaQuantita(prodotto);
        }
        public void Rimuovi(Prodotto prodotto){
            this.prodotti.remove(prodotto);
            decrementaQuantita(prodotto);
        }
        public void Modifica(String codice, String descrizione, int prezzo, int quantitàDisponibili, Date dataScadenza,materiale tipoMateriale,boolean pericoloso){
            for(Prodotto prodotto : prodotti){
                if(prodotto instanceof ProdottoAlimentare) {
                    ProdottoAlimentare prodottoAlimentare = (ProdottoAlimentare) prodotto;
                    prodottoAlimentare.setCodice(codice);
                    prodottoAlimentare.setPrezzo(prezzo);
                    prodottoAlimentare.setQuantitaDisponibili(quantitàDisponibili);
                    prodottoAlimentare.setDataScadenza(dataScadenza);
                   }else if (prodotto instanceof ProdottoNonAlimentare){
                    ProdottoNonAlimentare prodottoNonAlimentare = (ProdottoNonAlimentare) prodotto;
                    prodottoNonAlimentare.setCodice(codice);
                    prodottoNonAlimentare.setPrezzo(prezzo);
                    prodottoNonAlimentare.setDescrizioneProd(descrizione);
                    prodottoNonAlimentare.setQuantitaDisponibili(quantitàDisponibili);
                    prodottoNonAlimentare.setTipoMateriale(tipoMateriale);
                    prodottoNonAlimentare.setPericoloso(pericoloso);
                }
            }
        }
        public void incrementaQuantita(Prodotto prodotto){
            if(prodotto instanceof ProdottoAlimentare){
                ProdottoAlimentare prodottoAlimentare = (ProdottoAlimentare) prodotto;
                prodottoAlimentare.setQuantitaDisponibili(prodottoAlimentare.getQuantitaDisponibili() + 1);
            }else if(prodotto instanceof ProdottoNonAlimentare) {
                ProdottoNonAlimentare prodottoNonAlimentare = (ProdottoNonAlimentare) prodotto;
                prodottoNonAlimentare.setQuantitaDisponibili(prodottoNonAlimentare.getQuantitaDisponibili() + 1);
            }
        }
        public void decrementaQuantita(Prodotto prodotto){
            if(prodotto instanceof ProdottoAlimentare){
                ProdottoAlimentare prodottoAlimentare = (ProdottoAlimentare) prodotto;
                prodottoAlimentare.setQuantitaDisponibili(prodottoAlimentare.getQuantitaDisponibili() - 1);
            }else if(prodotto instanceof ProdottoNonAlimentare) {
                ProdottoNonAlimentare prodottoNonAlimentare = (ProdottoNonAlimentare) prodotto;
                prodottoNonAlimentare.setQuantitaDisponibili(prodottoNonAlimentare.getQuantitaDisponibili() - 1);
            }
        }
        public void VisualizzaProdotti(){
            for(Prodotto prodotto : prodotti)
                System.out.println(prodotto.toString());
        }
    public void importFromFile(String filePath) {
        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bf.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ";");
                if (st.countTokens() != 5) throw new IllegalArgumentException("Formato file non valido");

                String descrizioneProd = st.nextToken();
                int prezzo = Integer.parseInt(st.nextToken());
                int quantitaDisponibli = Integer.parseInt(st.nextToken());
                materiale tipoMateriale = ES12.materiale.valueOf(st.nextToken());
                boolean pericoloso = Boolean.parseBoolean(st.nextToken());

                //Aggiungi(new ProdottoNonAlimentare(descrizioneProd, prezzo, quantitaDisponibli, tipoMateriale, pericoloso));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

