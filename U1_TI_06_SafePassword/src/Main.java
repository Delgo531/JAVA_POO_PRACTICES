import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UsuarioSeguro usuario1 = new UsuarioSeguro();
        String password = "";

        System.out.println("Ingresa el nombre del usuario");
        usuario1.setNombreUsuario(sc.nextLine());

        System.out.println("Ingresa la nueva password");
        usuario1.setPassword(password = sc.nextLine());
        if (password.length() > 6) {

            System.out.println("Ingrese de nuevo su password");

            if(usuario1.autenticar(sc.nextLine())){
                System.out.println("Acceso Concedido");
            }
            else{
                System.out.println("Acceso Denegado");
            }

        }




    }
}