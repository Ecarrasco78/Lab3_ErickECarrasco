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
public class Picaro extends Personaje {

    public Picaro() {
        this.hp=150;
        this.ad=55;
        this.ap=0;
        this.efficiency=85;
        this.crit=60;
        this.luck=50;
        this.vel=30;
    }

    public Picaro(int hp, int ad, int vel, int efficiency, int luck, int crit, int ap) {
        super(hp, ad, vel, efficiency, luck, crit, ap);
    }

    @Override
    public String toString() {
        return "Berserk" + "\n"+"HP: "+hp+" "+ "Adaptability: "+ ad+" "+"AP: "+ap+" "+"Efficiency: "+efficiency+" "+"Critical: "+crit+" "+"Luck: "+luck+" "+"Velocity: "+vel+" ";
    }
    
    
}
