
package senasalud;

import java.util.Scanner;

public class Senasalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String Apellido;
        Scanner ae = new Scanner(System.in); 
        System.out.println("Ingrese su apellido: ");
        Apellido = ae.next();
        System.out.println("Su apellido es: "+Apellido);
        
        int Edad;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        Edad = e.nextShort();
        System.out.println("Su edad es: "+Edad);
    }
        
    }
    
