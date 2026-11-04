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
    //Método que devuelve el nombre
    public String getNombre(){
        return nombre;
    }
    //Método que devuelve la edad
    public int getEdad(){
        return edad;
    }
    //Método imprimir detalles de la persona
    public void imprimirDetalles(){
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }
}
