/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author srich
 */
public class Dosen {
    private String nidn;
    private ArrayList<Matakuliah> listMatakuliahPengampu;
    private Matakuliah matakuliahPengampu;
    
    public Dosen (String nidn, String nama){
        this.nidn=nidn;
        this.setNama(nama); 
    }
    
    public void lihatListMatakuliahPengampu(){
        Matakuliah matakuliah = null;
        matakuliah.getSks();
        
    }
    
    public void tambahMatakuliahPengampu(Matakuliah matakuliah){
        System.out.println("Data tambahMataKuliahpengampu");
        
    }
    
    public void setNidn(String nidn){
        this.nidn=nidn;
        
    }
    
    public String getNidn(){
        return getNidn();
    }

    private void setNama(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

