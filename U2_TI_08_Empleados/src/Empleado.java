public abstract class Empleado {
    //Atributos privados
    private String id;
    private String nombre;
    private double salarioBase;
    //Constructor
    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    //Metodo Abstracto
    public abstract double calcularSalario();
}
