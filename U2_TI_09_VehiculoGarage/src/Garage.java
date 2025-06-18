public class Garage {
    //Atributos
    private int numEspacios = 0;
    Vehiculo[] vehiculos;
    //Construcor
    public Garage(int numEspacios) {
        this.vehiculos = new Vehiculo[numEspacios];
    }
    public boolean estacionar(Vehiculo vehiculo) {
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] == null){
                vehiculos[i] = vehiculo;
                return true;
            }
        }
        return false;
    }

    public boolean retirar(String matricula){
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i].getPlacas().equals(matricula)){
                vehiculos[i] = null;
                return true;
            }
        }
        return false;
    }

    public int contarVehiculos(){
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null){
                numEspacios++;
            }
        }
        return numEspacios;
    }
}
