package ES7PreProva;

import ES5.Medicinale;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SalvataggioCapi  {
    public static void save(Serializable object, String filename){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
            out.writeObject(object);
            out.close();
            System.out.println("dati serializzati salvati in " + filename);
        }catch (Exception i){
            throw new RuntimeException(i);
        }
    }
    public static Object load(String filename) {
        Object obj;
        try (ObjectInputStream out = new ObjectInputStream(new FileInputStream(filename))) {
            obj = out.readObject();
            out.close();
            System.out.println("Data deserialized from " + filename);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return obj;
    }

}
