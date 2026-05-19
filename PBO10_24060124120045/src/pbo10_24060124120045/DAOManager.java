package pbo10_24060124120045;

//Nama: Agil Yudis Wibawa
//NIM : 24060124120045
//Lab : C1

/**
 * File: DAOManager.java
 * Deskripsi: pengelola DAO dalam program
 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}