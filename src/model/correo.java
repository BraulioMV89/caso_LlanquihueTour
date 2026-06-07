package model;

import util.correoInvalidoException;

/**
 * Clase que valida un correo electronico en el proyecto
 */

public class correo {
    
    private String direccionCorreo;
    /**
     * @param correoValido String que valida si es que una direccion de correo contiene el signo @
     * @param indicador String para saber que instancia especifica es la que falla
     * @throws correoInvalidoException 
     */
    public correo (String correoValido, String indicador) throws correoInvalidoException{
        //Valdidador de correo electronico
        
        if (!correoValido.matches("^(.+)@(\\S+)$")){
            throw new correoInvalidoException("Formato de correo invalido en: " + indicador);
    }
        this.direccionCorreo = correoValido;
    }
    /**
     * @return Retorna la dirección de correo.
     */
    public String getCorreo(){
        return direccionCorreo;
    }
    @Override
        public String toString(){
            return "Correo: " + direccionCorreo;
        }
}
