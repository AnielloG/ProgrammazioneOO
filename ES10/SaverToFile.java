package ES10;
import java.io.IOException;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class SaverToFile {
    public static void SaveToFile(Serializable object,String filename){
        try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(filename))){
            obj.writeObject(filename);
            obj.close();
            System.out.println("il file serializzato è in " + filename);
    }catch (IOException e){
            e.printStackTrace();
        }
    }
}
