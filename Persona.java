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
        //Comenzamos las condiciones de la edad
        if (edad >= 65){
            etapa = "Jubilado";
        }else if (edad >= 18){
            etapa = "Adulto";
        }else{
            etapa = "Menor de edad";
        }
        return etapa;
    }
    
    /**
     * Método de comparación de edades
     */
    public void imprimirSiEsMayorQue(int edadAComparar){
        //Comparando la edad introducida como parámetro
        if (edadAComparar < edad){
            System.out.println(nombre + " tiene más de " + edadAComparar + " años.");
        }else if (edadAComparar == edad){
            System.out.println(nombre + " tiene " + edadAComparar + " años."); 
        }else{
            System.out.println(nombre + " tiene menos de " + edadAComparar + " años.");
        }
    }
    
    /**
     * Método de diagnóstico de voto
     */
    public void diagnosticoDeVoto(){
        boolean puedeVotar = edad >= 18;
        //Primer if para determinar si puedeVotar es verdad
        if (puedeVotar == true){
            System.out.println("La persona puede votar.");
            //Segundo if para determinar si el sujeto tiene 60 años o más
            if (edad >= 60){
                System.out.println("La persona votará a un partido conservador.");
            }else{
                System.out.println("La persona votará a un partido progresista.");
            }
            //Segundo if terminado, ahora vamos con el else del primero
        }else{
            System.out.println("La persona no puede votar.");
        }
    }
}
