package pbo10_24060124120045;

//Nama: Agil Yudis Wibawa
//NIM : 24060124120045
//Lab : C1

import java.io.*;

/**
 * File: SerializePerson.java
 * Deskripsi: Program untuk serialisasi objek Person
 */

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}