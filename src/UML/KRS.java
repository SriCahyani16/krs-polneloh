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
public class KRS {
    private String noKRS;
    private ArrayList<Matakuliah> paketMatakuliah;
    
    
    public KRS ( String noKRS ){
        this.noKRS= noKRS;
        
    }

    KRS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void tambahMatakuliaKRS (Matakuliah matakuliah){
        
    }
    
    public void showMataKuliahKRS() {
       
    }
    
    public ArrayList<Matakuliah> showMatakuliahKRS(){
        return null;
        
    }
     
    
    public void setNoKRS(String noKRS){
        
    }
    
    public String getNoKRS(){
        return getNoKRS();
    }
}
