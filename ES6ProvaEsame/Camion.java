package ES6ProvaEsame;

import java.io.Serializable;

public class Camion extends Macchina implements Serializable {
    private double lunghezzaRimorchio;
    private double pesoCarico;
    private int limiteVelocita;

    public Camion(String tipoAutovettura,int nRuote,int cilindrata,String colore,int matricola,String targa,int nMarce,double lunghezzaRimorchio, double pesoCarico, int limiteVelocita){
        super(tipoAutovettura,nRuote,cilindrata,colore,matricola,targa,nMarce);
        this.limiteVelocita = limiteVelocita;
        this.lunghezzaRimorchio = lunghezzaRimorchio;
        this.pesoCarico = pesoCarico;
    }

    public double getPesoCarico() {
        return pesoCarico;
    }
    public double getLunghezzaRimorchio() {
        return lunghezzaRimorchio;
    }
    public int getLimiteVelocita() {
        return limiteVelocita;
    }
    public void setLimiteVelocita(int limiteVelocita) {
        this.limiteVelocita = limiteVelocita;
    }
    public void setLunghezzaRimorchio(double lunghezzaRimorchio) {
        this.lunghezzaRimorchio = lunghezzaRimorchio;
    }
    public void setPesoCarico(double pesoCarico) {
        this.pesoCarico = pesoCarico;
    }
    public void caricaRimorchio(double pesoCarico){
        this.pesoCarico += pesoCarico;
    }
    public void scaricaRimorchio(){
        this.pesoCarico = 0;
    }
}
