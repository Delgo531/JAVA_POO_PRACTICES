public class Producto {
    //Atributos
    private String codigo;
    private String nombre;
    private int cantidad;
    //Constructores
    Producto(String codigo, String nombre, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    //getters and setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null || codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("ERROR - Ingresar codigo valido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null || nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("ERROR - Ingresar codigo valido");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("ERROR - Ingresar cantidad valida");
        }

    }

}
