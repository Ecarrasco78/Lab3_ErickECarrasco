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
public class armas extends Mochila{
    int bonoAD;
    int bonoAP;

    public armas() {
    }

    public armas(int bonoAD, int bonoAP) {
        this.bonoAD = bonoAD;
        this.bonoAP = bonoAP;
    }

    public int getBonoAD() {
        return bonoAD;
    }

    public void setBonoAD(int bonoAD) {
        this.bonoAD = bonoAD;
    }

    public int getBonoAP() {
        return bonoAP;
    }

    public void setBonoAP(int bonoAP) {
        this.bonoAP = bonoAP;
    }
    
    
}
