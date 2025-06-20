import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario(3);

        Producto producto1 = new Producto("papucodigosilly1","papu-cereal", 2);
        Producto producto2 = new Producto("papucodigosilly2","papu-leche", 3);
        Producto producto3 = new Producto("papucodigosilly3","papu-gomittas", 8);
        Producto producto4 = new Producto("papucodigosilly4","papu-momazos", 1000);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);

        System.out.println(inventario.buscar("papucodigosilly1"));
        System.out.println(inventario.buscar("papucodigosilly9"));

        System.out.println(inventario.totalItems());

        System.out.println(inventario.eliminarProducto("papucodigosilly1"));

        System.out.println(inventario.totalItems());

        System.out.println(inventario.agregarProducto(producto4));

        System.out.println(inventario.totalItems());








    }
}