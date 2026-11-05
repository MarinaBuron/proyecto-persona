public class Persona {
    //Nombre de la persona
    private String nombre;
    //Edad de la persona
    private int edad;
    
    /**
     * Constructor de la clase Persona
     */
    public Persona (String elNombre, int laEdad){
        nombre = elNombre;
        edad = laEdad;
    }
    
    /**
     * Método que devuelve el nombre
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Método que devuelve la edad
     */
    public int getEdad(){
        return edad;
    }
    
    /**
     * Método que devuelve los detalles del objeto Persona
     */
    public void imprimirDetalles(){
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }
    
    /**
     * Método que verifica la mayoría de edad
     */
    public boolean esMayorDeEdad(){
        if (edad >= 18){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Método cumplir años
     */
    public void cumplirAnios(){
        edad = edad + 1;
    }
    
    /**
     * Método obtener etapa de vida
     */
    public String obtenerEtapaDeVida(){
        String etapa;
    
        if (edad >= 65){
            etapa = "Jubilado";
        }else if (edad >= 18){
            etapa = "Adulto";
        }else{
        etapa = "Menor de edad";
        }
        
        return etapa;
    }
}
