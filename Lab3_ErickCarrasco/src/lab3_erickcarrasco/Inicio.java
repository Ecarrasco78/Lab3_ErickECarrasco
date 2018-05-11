/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_erickcarrasco;

/**
 *
 * @author erick
 */
public class Inicio {
    int type;
    
    public Inicio(){
        
    }

    public Inicio(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public String personaje(){
        String pers="";
        if (type ==1) {
            pers="Mage";
            
        }
        if (type==2) {
            pers = "Archer";
        }
        
        if (type==3) {
            pers = "Berzerk";
        }
        if (type == 4) {
            pers = "Picaro";
        }
        return pers;
        
    }
    
}
