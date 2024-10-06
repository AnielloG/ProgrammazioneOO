package ES5;

import java.util.Date;
import java.util.Comparator;
public class MedTester {

    public static void main(String[] args){
        MedSystem ms = new MedSystem();

        ms.addMedicinali(new Medicinale("Xanax","Pfizer",new Date(12/11/22),12));
        ms.addMedicinali(new Medicinale("Paracetamolo","Pfizer",new Date(12/11/24),12));
        ms.addMedicinali(new Medicinale("Brufen","Pfizer",new Date(12/11/25),19));

        ms.addMedicinali(new MedicinaleSperimentale("Xanax","Pfizer",new Date(12/11/22),12,10,StatoAvanzamento.INIZIO));
        ms.addMedicinali(new MedicinaleSperimentale("Molly","Pfizer",new Date(12/11/22),12,55,StatoAvanzamento.INTERMEDIO));
        ms.addMedicinali(new MedicinaleSperimentale("Xanax","Pfizer",new Date(12/11/22),12,43,StatoAvanzamento.FINE));
    }
}
