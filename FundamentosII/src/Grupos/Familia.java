package Grupos;
import Humanos.Persona;
import java.util.ArrayList;

public class Familia {
    private Persona madre;
    private Persona padre;
    private String apellido1;
    private String apellido2;
    private ArrayList<Persona> hijos;
    private String notas;

    //constructores
    public Familia(Persona madre, String apellido1) {
        this.madre = madre;
        this.apellido1 = apellido1;
        this.hijos=new ArrayList<>();
    }

    public Familia(Persona madre, Persona padre, String apellido1, String apellido2) {
        this.madre = madre;
        this.padre = padre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.hijos=new ArrayList<>();
    }

    public Familia(Persona madre, Persona padre, String apellido1, String apellido2, ArrayList<Persona> hijos, String notas) {
        this.madre = madre;
        this.padre = padre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        hijos=new ArrayList<>();
        this.hijos = hijos;
        this.notas = notas;
    }

    public void agregarHijo(Persona p){
        hijos.add(p);
    }

    //setters
    public void setNotas(String notas) {
        this.notas = notas;
    }

    //getters
    public Persona getMadre() {
        return madre;
    }

    public Persona getPadre() {
        return padre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public ArrayList<Persona> getHijos() {
        return hijos;
    }

    public String getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "Familia \n" +
                "Madre \n" + madre +"\n"+
                "Padre \n" + padre +"\n"+
                "Apellido Paterno: " + apellido1 + '\n' +
                "Apellido Materno: " + apellido2 + '\n' +
                "Hijos \n" + hijos + "\n" +
                "Notas \n" + notas;
    }
}
