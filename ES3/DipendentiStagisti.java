package ES3;
import java.util.List;
import java.util.ArrayList;
public class DipendentiStagisti extends Dipendente{
    public String supervisore;
    //costruttore
    public DipendentiStagisti(String nome,String cognome,String ID,double salario, String supervisore){
        super(nome,cognome,ID,salario);
        this.supervisore = supervisore;
    }

    public String getSupervisore() {
        return supervisore;
    }

    public void setSupervisore(String supervisore) {
        this.supervisore = supervisore;
    }
    public double salarioStagista() {
        return getSalario() - 300;
    }
    public static List<Dipendente> getStagisti(List<Dipendente> dipendenti) {
        List<Dipendente> stagisti = new ArrayList<>();
        for (Dipendente dipendente : dipendenti) {
            if (dipendente instanceof DipendentiStagisti) {
                stagisti.add(dipendente);
            }
        }
        return stagisti;
    }
}
