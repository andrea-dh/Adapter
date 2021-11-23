package Humanos;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Persona {
    private String nombre;
    private boolean genero; // true=femeninio    false=masculino
    private Date fechaNacimiento;
    private Color colorOjos;
    private int estatura; //cm
    private String notas;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    //constructores
    public Persona(String nombre, boolean genero, Date fechaNacimiento, Color colorOjos) {
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.colorOjos = colorOjos;
    }

    public Persona(String nombre, boolean genero, Date fechaNacimiento, Color colorOjos, int estatura, String notas) {
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.colorOjos = colorOjos;
        this.estatura = estatura;
        this.notas = notas;
    }

    //métodos especiales
    public double edad(){
        double edad;
        long milis;
        Date fechaActual = new Date();
        milis=(fechaActual.getTime()-this.fechaNacimiento.getTime());
        edad=(double) (milis/(1000*60*60*24))/364.25;
        return edad;
    }

    public int actualizarEstatura(int estatura){
        int diferencia;
        diferencia=this.estatura-estatura;
        this.estatura=estatura;
        return diferencia;
    }

    //setters
    public void setNotas(String notas) {
        this.notas = notas;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Color getColorOjos() {
        return colorOjos;
    }

    public int getEstatura() {
        return estatura;
    }

    public String getNotas() {
        return notas;
    }

    //imprimir
    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' +
                "Notas: " + notas ;
    }
}
