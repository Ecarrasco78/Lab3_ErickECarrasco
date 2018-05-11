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
public class Easy extends Difficulty {
    int level;

    public Easy() {
    }

    public Easy(int diff) {
        super(diff);
        this.level=5;
    }
    
    public int lev(){
        int lev = level;
        return lev;
    }
}
