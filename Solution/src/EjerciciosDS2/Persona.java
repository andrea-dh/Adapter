package EjerciciosDS2;

public class Persona {
    /*
    2) Haz una clase llamada Persona que siga las siguientes condiciones:

    Los métodos que se implementaran son:
    calcularIMC(): calculara si la persona esta en su peso ideal
    (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor
    que 20, la función devuelve un -1, si devuelve un número entre 20 y 25
    (incluidos), significa que esta por debajo de su peso ideal la función
    devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene
    sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes
    para devolver estos valores.

    esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

    comprobarSexo(char sexo): comprueba que el sexo introducido es correcto.
    Si no es correcto, sera H. No sera visible al exterior.

    toString(): devuelve toda la información del objeto.

    generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de
    *****este su número su letra correspondiente.

    Este método sera invocado cuando
    se construya el objeto. Puedes dividir el método para que te sea más fácil.
    No será visible al exterior.


    Ahora, crea una clase ejecutable que haga lo siguiente:

    Pide por teclado el nombre, la edad, sexo, peso y altura.
    Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores
    variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores
    menos el peso y la altura y el último por defecto, para este último utiliza los
    métodos set para darle a los atributos un valor.
    Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o
    por debajo de su peso ideal con un mensaje.
    Indicar para cada objeto si es mayor de edad.
    Por último, mostrar la información de cada objeto.
    Puedes usar métodos en la clase ejecutable, para que os sea mas fácil.

     */

    private String nombre="";
    private int edad=0;
    private String DNI;
    private char sexo='H'; //(H hombre, M mujer)
    private double peso=0;
    private double altura=0;

    //constructores
    public Persona(){
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
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

    //metodos
    public int calcularIMC(){
        float num= (float) (peso/Math.pow(altura,2));
        if(num<20) return -1;
        if(num>=20 && num<=25) return 0;
        return 1;
    }

    public boolean esMayorDeEdad(){
        return edad>=18;
    }

    private void comprobarSexo(char sexo){
        if(this.sexo!=sexo) sexo='H';
    }

    private void generaDNI(){
        this.DNI="";
        for (int i = 0; i < 8; i++) {
            this.DNI=this.DNI+(Math.random()*10);
        }
        this.DNI=this.DNI+(char)((int)(Math.random()*(121-97))+96);
    }


    //Setters
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
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
