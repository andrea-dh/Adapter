package EjerciciosDS2.Luis;

public class Persona {
    private String nombre="";
    private int edad=0;
    private String dni;
    private char sexo='H';
    private double peso=0;
    private double altura=0;


    public Persona() {
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc= peso/(Math.pow(altura,2));
        if (imc<20){
            return -1;
        }
        if (imc>=20 && imc<=25){
            return 0;
        }

        return 1;


    }

    public boolean esMayorDeEdad(){
        return edad>17;

    }

    public void comprobarSexo(char sexo){
        if(!(this.sexo==sexo)) this.sexo='H';
    }

    public void generaDNI(){
        this.dni=""+(int)(Math.random()*100000000);
        //97-121
        this.dni+=(char)((int)(Math.random()*(121-97))+96);

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
