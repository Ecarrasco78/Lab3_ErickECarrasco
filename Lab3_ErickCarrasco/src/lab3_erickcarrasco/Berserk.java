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
public class Berserk extends Personaje{

    public Berserk() {
        this.hp=190;
        this.ad=80;
        this.ap=0;
        this.efficiency=80;
        this.crit=40;
        this.luck=15;
        this.vel=20;
    }

    public Berserk(int hp, int ad, int vel, int efficiency, int luck, int crit, int ap) {
        super(hp, ad, vel, efficiency, luck, crit, ap);
        
    }

    @Override
    public String toString() {
        return "Berserk" + "\n"+"HP: "+hp+" "+ "Adaptability: "+ ad+" "+"AP: "+ap+" "+"Efficiency: "+efficiency+" "+"Critical: "+crit+" "+"Luck: "+luck+" "+"Velocity: "+vel+" ";
    }
    
    
    
    
}
