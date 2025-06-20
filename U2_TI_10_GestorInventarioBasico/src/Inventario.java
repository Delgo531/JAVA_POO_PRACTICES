public class Inventario {
    //Atributos
    private Producto[] stock;
    //Constructor
    public Inventario(int tamano) {
        stock = new Producto[tamano];
    }
    //Metodos
    public boolean agregarProducto(Producto producto) {
        for (int i = 0; i < stock.length; i++){
            if (stock[i] == null){
                stock[i] = producto;
                return true;
            }
        }
        return false;
    }
    public boolean eliminarProducto(String codigo){
        for (int i = 0; i < stock.length; i++){
            if (stock[i].getCodigo().equals(codigo) && stock[i] != null){
                stock[i] = null;
                return true;
            }
        }
        return false;
    }
    public Producto buscar(String codigo){
        for (int i = 0; i < stock.length; i++){
            if (stock[i].getCodigo().equals(codigo)){
                return stock[i];
            }
        }
        return null;
    }
    int totalItems(){
        int contador = 0;
        for (int i = 0; i < stock.length; i++){
            if (stock[i] != null){
                contador++;
            }
        }
        return contador;
    }
}
