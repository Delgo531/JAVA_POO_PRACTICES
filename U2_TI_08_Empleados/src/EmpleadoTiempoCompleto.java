public class EmpleadoTiempoCompleto extends Empleado{
    //Atributos
    private String beneficios;
    //constructor
    public EmpleadoTiempoCompleto(String id, String nombre, String apellido, int salarioBase, String beneficios) {
        super(nombre, apellido, salarioBase);
        this.beneficios = beneficios;
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
}