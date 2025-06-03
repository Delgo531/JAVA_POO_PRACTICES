import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student Estudiante1 = new Student();
        Student Estudiante2 = new Student();
        Student Estudiante3 = new Student();
        Student Estudiante4 = new Student();
        Student Estudiante5 = new Student();

        // Estudiante 1
        System.out.println("Ingrese el nombre del estudiante 1: ");
        Estudiante1.setNombre(sc.nextLine());
        System.out.println("Ingrese la matricula del estudiante 1: ");
        Estudiante1.setMatricula(sc.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " del estudiante 1: ");
            Estudiante1.setNota(i, sc.nextDouble());
        }
        sc.nextLine(); // Limpiar buffer

        // Estudiante 2
        System.out.println("Ingrese el nombre del estudiante 2: ");
        Estudiante2.setNombre(sc.nextLine());
        System.out.println("Ingrese la matricula del estudiante 2: ");
        Estudiante2.setMatricula(sc.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " del estudiante 2: ");
            Estudiante2.setNota(i, sc.nextDouble());
        }
        sc.nextLine();

        // Estudiante 3
        System.out.println("Ingrese el nombre del estudiante 3: ");
        Estudiante3.setNombre(sc.nextLine());
        System.out.println("Ingrese la matricula del estudiante 3: ");
        Estudiante3.setMatricula(sc.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " del estudiante 3: ");
            Estudiante3.setNota(i, sc.nextDouble());
        }
        sc.nextLine();

        // Estudiante 4
        System.out.println("Ingrese el nombre del estudiante 4: ");
        Estudiante4.setNombre(sc.nextLine());
        System.out.println("Ingrese la matricula del estudiante 4: ");
        Estudiante4.setMatricula(sc.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " del estudiante 4: ");
            Estudiante4.setNota(i, sc.nextDouble());
        }
        sc.nextLine();

        // Estudiante 5
        System.out.println("Ingrese el nombre del estudiante 5: ");
        Estudiante5.setNombre(sc.nextLine());
        System.out.println("Ingrese la matricula del estudiante 5: ");
        Estudiante5.setMatricula(sc.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " del estudiante 5: ");
            Estudiante5.setNota(i, sc.nextDouble());
        }
        sc.nextLine();

        // Mostrar resultados
        System.out.println("\n----- RESULTADOS -----");

        mostrarDatos(Estudiante1, 1);
        mostrarDatos(Estudiante2, 2);
        mostrarDatos(Estudiante3, 3);
        mostrarDatos(Estudiante4, 4);
        mostrarDatos(Estudiante5, 5);

    }

    public static void mostrarDatos(Student est, int num) {
        System.out.println("Estudiante " + num + ":");
        System.out.println("Nombre: " + est.getNombre());
        System.out.println("Matrícula: " + est.getMatricula());
        System.out.printf("Promedio: %.2f\n", est.calcularPromedio());
        System.out.println("¿Aprobado?: " + (est.aprobado() ? "Sí" : "No"));
        System.out.println("-------------------------");
    }
}
