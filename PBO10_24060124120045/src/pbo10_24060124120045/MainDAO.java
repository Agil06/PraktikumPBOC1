package pbo10_24060124120045;

//Nama: Agil Yudis Wibawa
//NIM : 24060124120045
//Lab : C1

/**
 * File: MainDAO.java
 * Deskripsi: Main program untuk akses DAO
 */
public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Hanni");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}