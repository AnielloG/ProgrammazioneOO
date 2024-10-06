package ES6ProvaEsame;
import ES7PreProva.Negozio;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Test implements Serializable {
    private final ArrayList<Autovettura> autovetture;

    public Test(){
        this.autovetture = new ArrayList<>();
    }
    public Test(Autovettura... autovetture){
        this.autovetture = new ArrayList<>();
        this.add(autovetture);
    }
    public void add(Autovettura... autovetture){
        this.autovetture.addAll(Arrays.asList(autovetture));
    }
    public void remove(Autovettura... autovetture){
        this.autovetture.removeAll(Arrays.asList(autovetture));
    }

    public static void  save(Serializable object, String filename){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
            out.writeObject(object);
            out.close();
            System.out.println("I dati serializzati sono stati salvati in"+ filename);
        }catch (Exception i){
            throw new RuntimeException(i);
        }
    }
    public static Object load(String filename){
        Object obj;
        try(ObjectInputStream out = new ObjectInputStream(new FileInputStream(filename))){
            obj = out.readObject();
            out.close();
            System.out.println("Dati deserializzati da" + filename);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return obj;
    }
}
