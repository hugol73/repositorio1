/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable 
* y lo muestre por pantalla.
 */
package guia1_eje1;

import java.util.Scanner;

/**
 *
 * @author Administracion
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);      
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
                System.out.println("su nombre es " + nombre);
                    
// TODO code application logic here
    }
    
}
