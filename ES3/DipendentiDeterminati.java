package ES3;
import java.util.Date;
public class DipendentiDeterminati extends Dipendente{
    private Date dataFineContratto;
    public DipendentiDeterminati(String nome,String cognome,String ID,double salario,Date dataFineContratto){
        super(nome,cognome,ID,salario);
        this.dataFineContratto = dataFineContratto;
    }

    public Date getDataFineContratto() {
        return dataFineContratto;
    }
    public void setDataFineContratto(Date dataFineContratto) {
        this.dataFineContratto = dataFineContratto;
    }
}
