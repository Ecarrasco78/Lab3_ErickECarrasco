package lab3_erickcarrasco;
import java.util.*;

public class Lab3_ErickCarrasco {

    public static void main(String[] args) {
        Inicio I = new Inicio();
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
                
                
            }
        }
    }
    
}
