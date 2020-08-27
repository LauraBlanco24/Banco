public class Cliente {
    String nombre;
    int id;
    Cuenta cuenta;
    String tipoDocumento;

    public Cliente(String nombre, int id, Cuenta cuenta, String tipoDocumento) {
        this.nombre = nombre;
        this.id = id;
        this.cuenta = cuenta;
        this.tipoDocumento = tipoDocumento;
    }
}
