package DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAO {

    public void Save(Object o) throws IOException {
        String Filename= String.valueOf(o.getClass());
        File f = new File(Filename);
        if(!f.exists()){
            f.createNewFile();
            System.out.println("dosya oluşturuldu  "+o.getClass());
        }
        else {
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bv =new BufferedWriter(fw);
            bv.write(o.toString());
            bv.newLine();
            bv.close();
            System.out.println("dosyaya yazıldı  "+o.getClass());
        }
    }
    public void SaveArraylist(String FileName, List list){
        Path output = Paths.get(FileName);

        try {
            Files.write(output,list);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void GetData(String FileName,ArrayList arrayList){
        File file =new File(FileName);
        try {
            String line;
            FileReader fileReader = new FileReader(file);
            BufferedReader reader =new BufferedReader(fileReader);
            while ((line = reader.readLine()) != null) {
                arrayList.add(line);
            }
            reader.close();
        }catch (Exception e){
            System.out.println("dosya okuma hatası:  "+FileName);
        }
    }
}
