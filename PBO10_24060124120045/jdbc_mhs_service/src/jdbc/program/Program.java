/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

/**
 *
 * @author AGIL
 */

import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        try {
            // insert
            System.out.println("===insert");
            Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
            service.add(mhsAdd);
            System.out.println("berhasil insert: " + mhsAdd);
            displayAll();

            // update
            System.out.println("===update");
            Mahasiswa mhsUpdate = service.getById(5);
            System.out.println("Akan diupdate data lama: " + mhsUpdate);
            mhsUpdate.setNama("Dinaya");
            service.update(mhsUpdate);
            System.out.println("dengan data baru: " + mhsUpdate);
            displayAll();

            // delete
            System.out.println("===delete");
            System.out.println("akan di delete: " + service.getById(5));
            service.delete(5);
            displayAll();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayAll() throws Exception {
        System.out.println("===displayAll");
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa m : listMhs) {
            System.out.println(m);
        }
    }
}