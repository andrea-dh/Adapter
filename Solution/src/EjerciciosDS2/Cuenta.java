package EjerciciosDS2;

public class Cuenta {
    private String titular;
    private double cantidad;
    private int n;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    //Métodos especiales
    public double ingresar(double cantidad){
        if(cantidad>=0){
            this.cantidad=this.cantidad+cantidad;
        }
        return cantidad;
    }
    public double retirar(double cantidad){
        if((this.cantidad-cantidad)<0){
            this.cantidad=0;
        }
        return cantidad;
    }

    //Getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    //Override methods
    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
