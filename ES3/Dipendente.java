package ES3;

public class Dipendente {
    public String nome;
    public String cognome;
    public String ID;
    public double salario;

    //costruttore
    public Dipendente(String nome,String cognome,String ID,double salario){
        this.nome = nome;
        this.cognome = cognome;
        this.ID = ID;
        this.salario = salario;
    }
    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
