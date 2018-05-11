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
public class Personaje {
    
    int hp;
    int ad;
    int vel;
    int efficiency;
    int luck;
    int crit;
    int ap;
    

    public Personaje() {
    }

    public Personaje(int hp, int ad, int vel, int efficiency, int luck, int crit, int ap) {
        this.hp = hp;
        this.ad = ad;
        this.vel = vel;
        this.efficiency = efficiency;
        this.luck = luck;
        this.crit = crit;
        this.ap=ap;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

   

    
    
    
    
    
}
