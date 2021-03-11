/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 *
 * @author srich
 */

public class Mahasiswa extends Person {
    private String nim;
    private KRS krs = new KRS();
    int a = 7;
    char huruf;
    
   public Mahasiswa(String nim , String nama){
       this.nama=nama;
       this.nim= nim; 
       if (nama+nim == ""){
            System.out.println("nama dan nim tidak boleh kosong");

        }
        else if (nama.matches("[a-zA-Z]") ){
            System.out.println("nim tidak boleh huruf");

        }else if (nama.length() <=50){
            System.out.println("nama maksimal 50 karakter");
        }else if (nama == ""){
            System.out.println("nama tidak boleh kosong");
        }else if (!angka){
            System.out.println("nama tidak boleh angka");
        }else if (nama.matches("[0-9]+[a-zA-Z]+[a-zA-Z0-9]*$")) {
            System.out.println("nama tidak boleh karakter");
        }

   }
   
   
   
   public void cetakKRS(){
       System.out.println("cetak krs");
       
   }
   
   public void setNim(String nim){
       if (nim.length() == 7) {
            System.out.println("nim harus berisi 7 digit");
        }
   }
   
   public String getNim(){
       return this.nim;
   }
   
   public void pilihPaketKRS (KRS krs) {
       
   }
   
   public KRS getKRS(){
        return this.krs;
       
   }
   
    @Override
    public void showprofil() {
        System.out.printf("selamat datang mahasiswa");
    }


    private void setNama(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showProfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}