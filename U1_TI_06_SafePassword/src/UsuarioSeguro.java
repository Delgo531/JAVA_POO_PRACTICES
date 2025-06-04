public class UsuarioSeguro {
    //Atributos privados
    private String nombreUsuario;
    String password;
    //Getters and Setters

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null && !nombreUsuario.isEmpty()) {
            this.nombreUsuario = nombreUsuario;
        }
        else {
            System.out.println("Debes ingresar un nombre de usuario valido");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty() && password.length() >= 8  ) {

            boolean validarUppercase = false, validarLowercase = false, validarDigits = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    validarUppercase = true;
                }
                else if (Character.isLowerCase(password.charAt(i))) {
                    validarLowercase = true;
                }
                else if (Character.isDigit(password.charAt(i))) {
                    validarDigits = true;
                }
            }

            if(validarUppercase && validarLowercase && validarDigits){
                this.password = password;
                System.out.println("Password Valida");
            } else {
                System.out.println("Debes ingresar una password valida");
            }

        } else{
            System.out.println("Debes ingresar una password valida");
        }
    }
    //Metodos
    public boolean autenticar(String intentPassword){
        if (intentPassword.equals(password)) {
            return true;
        }
        else{
            System.out.println("Las contraseñas no coinciden");
            return false;
        }
//para commitear
    }
}
