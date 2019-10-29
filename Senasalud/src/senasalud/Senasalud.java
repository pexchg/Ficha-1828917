
package senasalud;

import java.util.Scanner;

public class Senasalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String Nombre;
        Scanner nb = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        Nombre = nb.next();
        System.out.println("Su nombre es: "+Nombre);
    }
        
    }
    
