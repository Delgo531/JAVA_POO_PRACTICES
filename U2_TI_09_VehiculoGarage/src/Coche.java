public class Coche extends Vehiculo {
    //Atributos
    private int numPuertas;
    //Constructores
    public Coche(String placas, String marca, int numPuertas) {
        super(placas, marca);
        this.numPuertas = numPuertas;
    }
}
