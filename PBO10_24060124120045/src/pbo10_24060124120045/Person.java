package pbo10_24060124120045;

//Nama: Agil Yudis Wibawa
//NIM : 24060124120045
//Lab : C1

import java.io.Serializable;

/**
 * File: Person.java
 * Deskripsi: Person database model
 */

public class Person implements Serializable {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}