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
public class Nightmare extends Difficulty{
    int level;

    public Nightmare() {
    }

    public Nightmare(int diff) {
        super(diff);
        this.level=15;
    }
    
    public int lev(){
        int lev=level;
        return lev;
    }
    
}
