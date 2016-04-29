package com.myssyt.bibtex;

import com.myssyt.bibtex.domain.Reference;
import java.util.ArrayList;
import java.io.*;

public class FileHandler {

    public static void writeFile(ArrayList<Reference> lista, String filename) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(lista);
        oos.close();
    }
    
    public static ArrayList<Reference> readFile(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Reference> lista = (ArrayList<Reference>) ois.readObject();
        ois.close();
        return lista;
    }
}
