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
public abstract class Person {
    String nama;
    boolean angka = true;

public abstract void showProfil();

public void setNama(String Nama){
          if(nama == "" ) {
           System.out.println("nama tidak boleh kosong");

       }else if(!angka){
           System.out.println("isi tidak boleh angka");
       }else if (nama.matches("[0-9]+[a-zA-Z]+[a-zA-Z0-9]*$")){
           System.out.println("isi tidak boleh karakter di kuar huruf");
       }else {
           return;
       }

}

public String getNama(){
    return this.nama;
}

}
