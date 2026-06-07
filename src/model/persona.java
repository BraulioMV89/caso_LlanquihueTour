package model;

public class persona {
/**
 * La clase persona y será la clase base de este proyecto 
 almacena datos básicos de identificación y contacto.
 */
    private String nombre; 
    private rut rut;
    private correo correo;
    private String contacto;
    private direccion direccion;
/**
 * Constructor de la clase Persona
 * Se almacenan datos básicos de identificación y contacto, tanto para usuarios y trabajadores.
 * @param nombre Representa el nombre de una persona, ya sea usuario o trabajador
 * @param rut Representa el rut de la persona (Relación de composición)
 * @param correo indica el correo de una persona (Relacion composición)
 * @param contacto Representa el Telefono/Celular de contacto 
 * @param direccion Se refiere a la dirección particular de una persona (Relación de composición)
 */
    public persona(String nombre, rut rut, correo correo, String contacto, direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.contacto = contacto;
        this.direccion = direccion;
    }
/**
 * Obtiene el nombre de la persona
 * @return Retorna el nombre completo, como una cadena de texto(String)
 */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public rut getRut() {
        return rut;
    }

    public void setRut(rut rut) {
        this.rut = rut;
    }

    public correo getCorreo() {
        return correo;
    }

    public void setCorreo(correo correo) {
        this.correo = correo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return "~~~ Datos Personales ~~~" +
        "\nNombre: " + nombre +
        "\n" + rut +
        "\n" + correo +
        "\nContacto: " + contacto +
        "\nDireccion: " + direccion +
        "\n"
        ;
    }
    
}
