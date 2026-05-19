package pbo10_24060124120045;

import java.io.*;

//Nama: Agil Yudis Wibawa
//NIM : 24060124120045
//Lab : C1

/**
 * File: ReadSerializedPerson.java
 * Deskripsi: Program untuk membaca objek yang telah terserialisasi
 */
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("serialized person name " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}