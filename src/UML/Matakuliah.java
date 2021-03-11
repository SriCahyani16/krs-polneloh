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
public class Matakuliah {
    private String NamaMatakuliah;
    private int sks;
    private int semester;
    private Dosen pengampu;
    
public Matakuliah ( String NamaMatakuliah , int sks){
  this.NamaMatakuliah= NamaMatakuliah;
  this.sks=sks;
}

public void setNamaMatakuliah(String namaMatakuliah){
    this.NamaMatakuliah=namaMatakuliah;
}

public String getNamaMatakuliah(){
return NamaMatakuliah;
}

public void setSks(int sks){
this.sks=sks;
}


public int getSks(){
    return sks;
}


public void setSemester(int semester){
this.semester=semester;
}

public int getSemester(){
return semester;
}

public void setPengampu (Dosen pengampu){
   this.pengampu=pengampu;
}

public Dosen getPengampu(){
     return pengampu;
}

public void showMatakuliah(){
    
}

}


