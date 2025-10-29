/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombreEstudiante = "Daniel Bernardo";
        String apellidoEstudiante = "Rios Erreis";
        int edad = 25;
        String direccion = "El Valle";
        String universidad = "UTPL";
        String ciclo = "Primer Ciclo";
        String asignatura = "Introduccion a la programacion";
        String paralelo = " Paralelo A";
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\n\n%s\n\n%s\n\n%s\n\n%s\n\n%s\n", nombreEstudiante, 
                apellidoEstudiante, edad, direccion, universidad, ciclo, asignatura, paralelo);
        

        
    }
}
