public class Vehiculo {

    String placa;
    String marca;
    String modelo;
    double combustible;
    boolean encendido;

    public Vehiculo(String placa, String marca, String modelo, double combustible) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.encendido = false;
    }

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Combustible: " + combustible + " litros");
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
    }

    public void encender() {
        if (combustible > 0) {
            encendido = true;
            System.out.println("Vehiculo encendido.");
        } else {
            System.out.println("No hay combustible.");
        }
    }

    public void apagar() {
        encendido = false;
        System.out.println("Vehiculo apagado.");
    }

    public void realizarRecorrido(double consumo) {

        if (!encendido) {
            System.out.println("El vehiculo esta apagado.");
        } else if (consumo > combustible) {
            System.out.println("No hay suficiente combustible.");
        } else {
            combustible = combustible - consumo;
            System.out.println("Recorrido realizado.");
        }
    }

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo(
                "ABC123",
                "Toyota",
                "2024",
                40
        );

        vehiculo.mostrarInformacion();

        vehiculo.encender();

        vehiculo.realizarRecorrido(10);

        System.out.println("\nDespues del recorrido:");
        vehiculo.mostrarInformacion();

        vehiculo.apagar();
    }
}