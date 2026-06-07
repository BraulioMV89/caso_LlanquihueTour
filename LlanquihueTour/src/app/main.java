package app;

import model.*;
import model.colaborador;
import util.rutInvalidoException;
import util.correoInvalidoException;
/**
 * 
 * Clase principal para el proyecto Llanquihue Tour  
 * 
 */
public class main {
    

    public static void main(String[] args) {
    System.setOut (new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));

        System.out.println("=== Sistema de gestión Llanquihue Tour ===");
        System.out.println("\n");
        
        try{
        //------------
        //Instancia 1
        //------------
            //Se instancia un RUT válido
            rut rutUsuario1 = new rut("13313898-2", "Usuario 1");
            //Se instancia un formato de correo válido
            correo correoUsuario1 = new correo("a.perez1976@gmail.com", "Usuario 1");
            //Dirección para usuario de Llanquihue Tour 
            direccion direccionUsuario1 = new direccion("Los Alpes" , 1329, "Villa los Presidentes", "Puerto Varas", "Los Lagos");
            //Datos de una persona
            persona usuario1 = new persona("Andres Perez",rutUsuario1,correoUsuario1,"+569 1543 4132",direccionUsuario1);
            System.out.println(usuario1);
            
        //------------
        //Instancia 2
        //------------
            rut rutColaborador1 = new rut("15992321-3", "Colaborador 1");
            
            correo correoColaborador1 = new correo("J_Alcayaga@llanquihuetour.cl", "Colaborador 1");
            
            direccion direccionColaborador1 = new direccion("Las Loicas", 4903, "Altos del Llanquihue", "Puerto Varas", "Los Lagos");
            
            colaborador colaborador1 = new colaborador ( "Juan Alcayaga", rutColaborador1, correoColaborador1, "+569 8897 4143", direccionColaborador1, "Guía Turistico");
            System.out.println(colaborador1);
            
        //------------
        //Instancia 3
        //------------
        //instancia con error en la línea 53, para hacer prueba del Validador de correo
            rut rutColaborador2 = new rut ("18993421-2", "Colaborador 2");
            
            correo correoColaborador2 = new correo("j.riquelme88llanquihuetour.cl", "Colaborador 2");
            
            direccion direccionColaborador2 = new direccion ("Los Copihues", 1234, "Poblacion O'Higgins", "Puerto Montt", "Los Lagos");
            
            colaborador colaborador2 = new colaborador ("Jose Riquelme", rutColaborador2, correoColaborador2, "+569 3313 7890", direccionColaborador2, "Chofer de traslados");
            System.out.println(colaborador2);
            
            
        } catch (rutInvalidoException | correoInvalidoException e){
            System.out.println("❌ Error Detectado " + e.getMessage());  
            
        }
    }
    
}
