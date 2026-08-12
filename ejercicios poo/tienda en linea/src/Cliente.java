public class Cliente {

    String nombre;
    String correo;
    String identificacion;

    public Cliente(String nombre, String correo, String identificacion) {
        this.nombre = nombre;
        this.correo = correo;
        this.identificacion = identificacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Identificacion: " + identificacion);
    }
}
