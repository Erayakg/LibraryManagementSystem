package DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public abstract class AbstractSave {

    public void Save(Object o) throws IOException {
        String Filename= String.valueOf(o.getClass());
        File f = new File(Filename);
        if(!f.exists()){
            f.createNewFile();
            System.out.println("dosya oluşturuldu"+o.getClass());
        }
        else {
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bv =new BufferedWriter(fw);
            bv.write(o.toString());
            bv.newLine();
            bv.close();
            System.out.println("dosyaya yazıldı"+o.getClass());
        }
    }
    public void GetData(String FileName, ArrayList<Object> A){
        File file =new File(FileName);
        
    }
}
