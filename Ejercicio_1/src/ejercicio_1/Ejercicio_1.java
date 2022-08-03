/*Autor: Jaime Higueras Medina*/
package ejercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_1 {
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        
        int numero;
        numero = LEER_NUMERO();
        
        //Si el número es par
        if(numero % 2 == 0){
            System.out.println("");
            System.out.println("El numero introducido es par.");
            
            //Recorremos todos los pares de manera descendiente
            int i = numero;
            
            while(i != 0){
                System.out.println(i);
                i -= 2;
            }
            //Imprimimos el último resultado
            System.out.println(i);
            
        }else{
            System.out.println("");
            System.out.println("El numero introducido es impar.");
            
            //Recorremos todos los impares de manera descendiente
            int i = numero;
            
            while(i != 1){
                System.out.println(i);
                i -= 2;
            }
            
            //Imprimimos el último resultado
            System.out.println(i);
        }  
    }
    
    //Lectura de un número por teclado
    public static int LEER_NUMERO(){
        
        int numero;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Introduzca un número: ");
        
        try {
            
            numero = reader.nextInt();
        
            if(numero < 0){
                System.out.println("El número introducido es negativo.");
                System.exit(0);
                return -1;
            }else{
                return numero;
            }
            
        } catch (InputMismatchException ime){
            System.out.println("El número introducido no es un entero.");
            System.exit(0);
            return -1;
           }
    }
}
