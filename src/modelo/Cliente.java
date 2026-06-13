
package modelo;

/**
 *
 * @author Benjamin
 */
public class Cliente {
    /*
    cedula: String
    nombre: String
    vigente: boolean
    
    validarCedula(cedula:String)boolean
    validarNombre(nombre:String)boolean
    mostrarMensaje(mensaje: String, tipo String) void
    
    */
    //Atributos:
    private String cedula;
    private String nombre;
    private boolean vigente;
    
    //Constructor:
    public Cliente(String cedula, String nombre, boolean vigente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.vigente = vigente;
    }
    
    //Getters

    public String getCedula() { return cedula; }

    public String getNombre() { return nombre; }

    public boolean isVigente() { return vigente; }

    public void setCedula(String cedula) { this.cedula = cedula; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setVigente(boolean vigente) { this.vigente = vigente; }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " | Cédula: " + cedula; }

}
