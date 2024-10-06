package ES3;

public class DipendentiIndeterminati extends Dipendente{
    public static final double bonus_percentuale = 0.3;
    public String qualificaSettoriale;

    //costruttore
    public DipendentiIndeterminati(String nome,String cognome,String ID,double salario,double bonus_percentuale, String qualificaSettoriale){
        super(nome,cognome,ID,salario);
        this.qualificaSettoriale = qualificaSettoriale;
    }

    public double salarioIndeterminato() {
        return getSalario() *(1 + bonus_percentuale);
    }
    public void setQualificaSettoriale(String qualificaSettoriale) {
        this.qualificaSettoriale = qualificaSettoriale;
    }

    public String getQualificaSettoriale() {
        return qualificaSettoriale;
    }
}
