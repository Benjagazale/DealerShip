package modelo;

public class Vehiculo {

    private String patente;
    private char condicion;

    //Constructor
    public Vehiculo(String patente, char condicion) {
        this.patente = patente;
        this.condicion = condicion;
    }
    
    //Getters

    public String getPatente() {
        return patente;
    }

    public char getCondicion() {
        return condicion;
    }
    
    //Setters

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }
    
    //To String

    @Override
    public String toString() {
        return "Patente Vehiculo: " + patente + " | Condición: " + condicion; }
}
