package com.myssyt.bibtex;

import java.util.ArrayList;
import java.io.*;

public class FileHandler {

    public static void writeFile(ArrayList<Viite> lista, String filename) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(lista);
        oos.close();
    }
    
    public static ArrayList<Viite> readFile(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Viite> lista = (ArrayList<Viite>) ois.readObject();
        ois.close();
        return lista;
    }
}
