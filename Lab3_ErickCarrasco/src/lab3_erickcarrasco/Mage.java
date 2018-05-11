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
public class Mage extends Personaje{

    public Mage() {
        this.hp=120;
        this.ad=20;
        this.ap=50;
        this.efficiency=70;
        this.crit=2;
        this.luck=20;
        this.vel=10;
    }

    public Mage(int hp, int ad, int vel, int efficiency, int luck, int crit, int ap) {
        super(hp, ad, vel, efficiency, luck, crit, ap);
        
        
        
    }
    

    @Override
    public String toString() {
        return "Mage: " + "\n"+"HP: "+hp+" "+ "Adaptability: "+ ad+" "+"AP: "+ap+" "+"Efficiency: "+efficiency+" "+"Critical: "+crit+" "+"Luck: "+luck+" "+"Velocity: "+vel+" ";
    }
    
    
    
}
