abstract class Vehiculo {
    //Atributos
    private String placas;
    private String marca;
    //Constructores
    public Vehiculo(String placas, String marca) {
        this.placas = placas;
        this.marca = marca;
    }
    public String getPlacas() {
        return placas;
    }
    public String getMarca(){
        return marca;
    }
}
