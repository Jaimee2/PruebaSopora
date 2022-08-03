/*Autor: Jaime Higueras Medina*/
package ejercicio_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio_2 {

    
    
     public static List<Persona> listaPersonas = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        System.out.println("Ejercicio 2");
        listaPersonas = LEER_PERSONAS("personas.txt");
                
        //Cantidad de personas mayores de edad
        int p_mayores = 0;
        //Cantidad de personas menores de edad
        int p_menores = 0;
        //Cantidad de personas masculinas mayores de edad
        int p_mas_mayor = 0;
        //Cantidad de personas femeninas menores de edad
        int p_fem_mayor = 0;
        //Cantidad de mujeres
        int p_mujeres = 0;

        for (int i = 0; i < listaPersonas.size(); i++) {

            if(listaPersonas.get(i).edad >= 18){
               p_mayores++;
               if("M".equals(listaPersonas.get(i).sexo)){
                   p_mas_mayor++;
               }else{
                   p_fem_mayor++;
               }
            }else{
                p_menores++;
            }
            
            if("F".equals(listaPersonas.get(i).sexo)){
                   p_mujeres++; 
               }
        }
        System.out.println("Cantidad de personas mayores de edad: " + p_mayores);
        System.out.println("Cantidad de personas menores de edad: " + p_menores);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + p_mas_mayor);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + p_fem_mayor);
        
        float e = (float)p_mayores/listaPersonas.size();
        System.out.println("Porcentaje de personas mayores de edad: " + (e) + " %");
        
        float f = (float)p_mujeres/listaPersonas.size();
        System.out.println("Porcentaje de mujeres: " + (f)*100 + " %");
        
    }
    
    public static List<Persona> LEER_PERSONAS(String ruta) throws FileNotFoundException, IOException{
        
        List<Persona> listaPersonas = new ArrayList<>();
        
        
        File f;
        FileReader lectorArchivo;
        
        f = new File(ruta);
        System.out.println("ruta: " + ruta);
        lectorArchivo = new FileReader(f);
        
        BufferedReader br = new BufferedReader(lectorArchivo);
        
        String linea;
        String[] parts;
        while( (linea = br.readLine()) != null){
            parts = linea.split(",");
            
            
            Persona persona = new Persona(parts[0],Integer.parseInt(parts[1]),parts[2]);
            listaPersonas.add(persona);
        }
        
        br.close();
        lectorArchivo.close();
        
        return listaPersonas;
    }
    
}
