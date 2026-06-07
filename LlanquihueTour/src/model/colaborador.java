package model;

/**
 * Esta clase representa a un colaborador/trabajador de Llanquihue Tour
 Hereda atributos de la clase persona
 */
public class colaborador extends persona{
    
    private String cargo;

    /**
     * Esta clase hereda los atributos de persona
     * @param cargo con este String se representa el cargo que tiene una persona
     * en caso de que sea trabajador o colaborador de Llanquihue tour.
     */
    public colaborador(String nombre, rut rut, correo correo, String contacto, direccion direccion, String cargo) {
        super(nombre, rut, correo, contacto, direccion);
        this.cargo = cargo;
    }
    /**
     * @return Sobrescribe el método y trae todos los datos personales formateados
 por la clase persona.
     */
   @Override
    public String toString(){
        return super.toString()+
                "~~~ Puesto en Llanquihue Tour ~~~" +
                "\nCargo: " + cargo +
                "\n";
    }
    
    
}
