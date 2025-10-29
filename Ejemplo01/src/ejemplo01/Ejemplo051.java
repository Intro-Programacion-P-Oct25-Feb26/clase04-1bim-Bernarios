/*
René Rolando

Elizalde Solano

1983
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo051 {
    public static void main(String[] args) {
        // Secuencia de escape \n y \t
        String nombreEstudiante = "René Rolando";
        String apellidoEstudiante = "Elizalde Solano";
        int nacimiento = 1983;
        
        System.out.println(nombreEstudiante+"\n"+apellidoEstudiante+ "\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n\n"+apellidoEstudiante+ "\n\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n"+"\n"+apellidoEstudiante+ "\n"+
                "\n"+ nacimiento);
        // System.out.println(nombreEstudiante+"\t"+apellidoEstudiante);   
        // System.out.println(nombreEstudiante+"\n\t"+apellidoEstudiante);
        // el "\t" significa que esta aplicando un tabulador(4espacios) y el "\n" sirve para dar un salto de linea   
    }
}
