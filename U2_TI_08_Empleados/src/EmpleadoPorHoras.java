public class EmpleadoPorHoras extends Empleado{
    //Atributos
    private int horasTrabajadas;
    //Constructores
    public EmpleadoPorHoras(String id, String nombre, String apellido, int salarioBase, int horasTrabajadas) {
        super(nombre, apellido, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() * horasTrabajadas;
    }
}
