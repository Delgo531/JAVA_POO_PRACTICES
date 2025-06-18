public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage(4);

        Coche Vento = new Coche("GHY-8374", "Volkswagen", 4);
        Coche Tsuru = new Coche("POI-5129", "Nissan", 3);
        Motocicleta FT150 = new Motocicleta("YUB-8712", "Mortalika", true);
        Motocicleta Duke200 = new Motocicleta("TFA-5698", "KTM", true);


            garage.estacionar(Vento);
            garage.estacionar(Tsuru);
            garage.estacionar(FT150);
            garage.estacionar(Duke200);

            garage.retirar("GHY-8374");

        System.out.println("\nla cantidad de vehiculos estacionados es: " + garage.contarVehiculos());

    }

}