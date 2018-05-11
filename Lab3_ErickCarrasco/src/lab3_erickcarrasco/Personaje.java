/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_erickcarrasco;
import java.util.*;

/**
 *
 * @author erick
 */
public class Personaje extends Inicio{
    ArrayList<Rasgo> r= new ArrayList();
    int hp;
    int ad;
    int vel;
    int efficiency;
    int luck;
    int crit;
    

    public Personaje() {
    }

   

    public Personaje(int type) {
        super(type);
    }
    
    
    
    
}
