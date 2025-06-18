public class Main {
    public static void main(String[] args) {
    Empleado empleado1 = new EmpleadoTiempoCompleto("20243ds045", "Diego", "Delgado", 6000, "Muchos beneficios >:3");
    Empleado empleado2 = new EmpleadoPorHoras("2024054", "Pepe", "Toñó", 50, 8  );

        System.out.println("Salario de Diego: " + empleado1.calcularSalario());
        System.out.println("Salario de Pepe: " + empleado2.calcularSalario());


        }
    }
