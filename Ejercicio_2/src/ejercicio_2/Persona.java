package ejercicio_2;

public class Persona {
    public String nombre;
    public int edad;
    public String sexo;
    
    //Constructor
    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    
     public int getEdad(){
        return edad;
    }
     
     public String getSexo(){
        return sexo;
    }
    
}
