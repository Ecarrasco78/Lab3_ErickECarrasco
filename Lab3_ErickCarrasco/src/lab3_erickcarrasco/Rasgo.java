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
public class Rasgo extends Personaje{
    String Edad;
    String Nombre;
    String estatura;
    String color;
    String raza;

    public Rasgo() {
    }

    public Rasgo(String Edad, String Nombre, String estatura, String color, String raza) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.estatura = estatura;
        this.color = color;
        this.raza = raza;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Rasgo{" + "Edad=" + Edad + ", Nombre=" + Nombre + ", estatura=" + estatura + ", color=" + color + ", raza=" + raza + '}';
    }
    
    
}
