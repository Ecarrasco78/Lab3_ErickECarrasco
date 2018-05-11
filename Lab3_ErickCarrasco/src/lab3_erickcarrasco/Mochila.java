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
public class Mochila {
    String armas;
    String armaduras;
    String talismanes;

    public Mochila() {
    }

    public Mochila(String armas, String armaduras, String talismanes) {
        this.armas = armas;
        this.armaduras = armaduras;
        this.talismanes = talismanes;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public String getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(String armaduras) {
        this.armaduras = armaduras;
    }

    public String getTalismanes() {
        return talismanes;
    }

    public void setTalismanes(String talismanes) {
        this.talismanes = talismanes;
    }
    
}
