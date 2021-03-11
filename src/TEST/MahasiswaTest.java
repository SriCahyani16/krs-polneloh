/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;
import UML.Mahasiswa;
/**
 *
 * @author srich
 */
public class MahasiswaTest {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        //nama tidak boleh kosong
        mhs.setNama("");
        String expextedResult = null;
        if (mhs.getNama() == expextedResult){
            System.out.println("Test 1 berhasil");
        }else {
            System.out.printf("tes 2 gagal");
        }
        nimharus7(mhs);
    }

    //nim harus 7 digit
    public static void nimharus7(Mahasiswa mhs){

        mhs.setNim("1234567");
        String expextedResult = null;
        if (mhs.getNim() == expextedResult){
            System.out.println("Test 1 berhasil");
        }else {
            System.out.printf("tes 2 gagal");
        }

    }

    
    
}
