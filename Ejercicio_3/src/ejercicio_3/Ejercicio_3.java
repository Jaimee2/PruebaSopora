/*Autor: Jaime Higueras Medina*/
package ejercicio_3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio_3 {

    public static void main(String[] args) {
        System.out.println("Ejercicio_3");
        int horasTrabajadas = LEER_HORASTRABAJADAS();
        int tarifa = LEER_TARIFA();
        float sueldo;
        
        if(horasTrabajadas <= 40){
           sueldo = horasTrabajadas * tarifa;
        }else{
            int horasExtras = horasTrabajadas - 40;
            sueldo = 40 * tarifa;
            
            sueldo += horasExtras * (tarifa * 1.5);
        }
        System.out.println("Sueldo: " + sueldo);
    }
    
    public static int LEER_HORASTRABAJADAS(){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Introduzca las horas trabajadas: ");
        int horas;
        try {
            
            horas = reader.nextInt();
        
            if(horas < 0){
                System.out.println("Las horas trabajadas nos pueden ser negativas.");
                System.exit(0);
                return -1;
            }else{
                return horas;
            }
            
        } catch (InputMismatchException ime){
            System.out.println("Las horas trabajadas debe de ser un entero.");
            System.exit(0);
            return -1;
           }
    }
    
    public static int LEER_TARIFA(){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Introduzca la tarifa: ");
        int horas;
        try {
            
            horas = reader.nextInt();
        
            if(horas < 0){
                System.out.println("la tarifa no puede ser negativa.");
                System.exit(0);
                return -1;
            }else{
                return horas;
            }
            
        } catch (InputMismatchException ime){
            System.out.println("La tarifa debe de ser un entero.");
            System.exit(0);
            return -1;
           }
    }    
}
