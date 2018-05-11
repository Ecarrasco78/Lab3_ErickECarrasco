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
public class talismanes extends Mochila{
    String bono;
    String malditzione;

    public talismanes() {
    }

    public talismanes(String bono, String malditzione) {
        this.bono = bono;
        this.malditzione = malditzione;
    }

    public String getBono() {
        return bono;
    }

    public void setBono(String bono) {
        this.bono = bono;
    }

    public String getMalditzione() {
        return malditzione;
    }

    public void setMalditzione(String malditzione) {
        this.malditzione = malditzione;
    }
    
    
}
