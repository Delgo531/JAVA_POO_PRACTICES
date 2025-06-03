import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        float peso;
        float altura;
        String nombre;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su peso: ");
        peso = Float.parseFloat(scanner.nextLine());

        System.out.println("Ingrese su altura: ");
        altura = Float.parseFloat(scanner.nextLine());

        persona.setAltura(altura);
        persona.setPeso(peso);
        persona.setNombre(nombre);

        float imc = persona.calcularIMC();

        persona.imprimirIMC(imc);

    }
}
