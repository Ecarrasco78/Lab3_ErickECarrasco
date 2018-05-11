package lab3_erickcarrasco;
import java.util.*;

public class Lab3_ErickCarrasco {

    public static void main(String[] args) {
        Inicio I = new Inicio();
        Difficulty D = new Difficulty();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("***********");
        System.out.println("Bienvenido");
        System.out.println("");
        int menu = -1;
        while(menu != 3){
            System.out.println("1/ Iniciar");
            System.out.println("2/ Difficulty");
            System.out.println("3/Salir");
            
            if (menu ==1) {
                System.out.println("Crear personaje");
                System.out.println("1/ Mago");
                System.out.println("2/ Berzerk");
                System.out.println("3/ Berzerk");
                System.out.println("4/ Picaro");
                System.out.println("****");
                System.out.println("Ingrese el que desea");
                int select;
                select = sc.nextInt();
                I = new Inicio(select);
                
                
            }
            if (menu == 2) {
                System.out.println("Select difficulty");
                System.out.println("1/ Easy $ \n Enemies are recruits, you will have a good time enjoying this game");
                System.out.println("2/Give me a challenge \n You are looking for enemies to test your skills, enemies are veterans");
                System.out.println("3/Give me a nightmare! \n You are inhuman, enemies are unforgiving and the difficulty is like your name, Relentless");
                int sd;
                sd = sc.nextInt();
                D=new Difficulty(sd);
                if (sd ==1) {
                    
                }
            }
        }
    }
    
}
