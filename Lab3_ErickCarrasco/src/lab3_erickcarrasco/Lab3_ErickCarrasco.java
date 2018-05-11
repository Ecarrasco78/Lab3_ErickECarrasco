package lab3_erickcarrasco;
import java.util.*;

public class Lab3_ErickCarrasco {

    public static void main(String[] args) {
        Inicio I = new Inicio();
        Difficulty D = new Difficulty();
        int sd;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("***********");
        System.out.println("Bienvenido");
        System.out.println("");
        int menu = -1;
        while(menu != 3){
            System.out.println("1/ Iniciar");
            System.out.println("2/ Difficulty");
            System.out.println("3/ Salir");
            menu = sc.nextInt();
            if (menu ==1) {
                System.out.println("Crear personaje");
                System.out.println("1/ Mago");
                System.out.println("2/ Archer");
                System.out.println("3/ Berzerk");
                System.out.println("4/ Picaro");
                System.out.println("****");
                System.out.println("Ingrese el que desea");
                int select;
                select = sc.nextInt();
                I = new Inicio(select);
                if (select==1) {
                    Personaje P = new Mage();
                    System.out.println(P);
                }
                if (select == 2) {
                    Personaje A = new Archer();
                    System.out.println(A);
                }
                if (select == 3) {
                    Personaje B = new Berserk();
                    System.out.println(B);
                }
                if (select == 4) {
                    Personaje X = new Picaro();
                    System.out.println(X);
                }
                
                
            }
            if (menu == 2) {
                System.out.println("Select difficulty");
                System.out.println("1/ Easy $ \n Enemies are recruits, you will have a good time enjoying this game");
                System.out.println("2/Give me a challenge \n You are looking for enemies to test your skills, enemies are veterans");
                System.out.println("3/Give me a nightmare! \n You are inhuman, enemies are unforgiving and the difficulty is like your name, Relentless");
                
                sd = sc.nextInt();
                D=new Difficulty(sd);
                if (sd ==1) {
                    System.out.println("Easy $ Difficulty");
                }
                if (sd == 2) {
                    System.out.println("Give me a challenge");
                }
                if (sd==3) {
                    System.out.println("Give me a nightmare!");
                }
            }
        }
    }
    
}
