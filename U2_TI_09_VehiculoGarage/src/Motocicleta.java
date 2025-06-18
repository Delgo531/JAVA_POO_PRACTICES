public class Motocicleta extends Vehiculo {
    //Atributos
    private boolean tieneCaja;
    //Constructores
    public Motocicleta(String placas, String marca, boolean tieneCaja) {
        super(placas, marca);
        this.tieneCaja = tieneCaja;
    }
}
