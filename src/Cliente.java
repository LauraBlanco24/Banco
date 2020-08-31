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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public double retirar(double cantidad){
        if(cantidad <= this.cuenta.Saldo){
            this.cuenta.Saldo = this.cuenta.Saldo - cantidad;
            System.out.println("Transación exitosa, su nuevo saldo es $ "+this.cuenta.Saldo);
            return this.cuenta.Saldo;
        }else{
            System.err.println("Saldo insuficiente su saldo actual es de $ "+this.cuenta.Saldo+" Y usted deseea retirar $ "+cantidad);
            return this.cuenta.Saldo;
        }
    }

    public double consultarSaldo(){
        System.out.println("su saldo es de $ "+this.cuenta.Saldo);
        return this.cuenta.Saldo;
    }
}
