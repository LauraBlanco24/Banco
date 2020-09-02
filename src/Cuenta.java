import java.util.Scanner;

public class Cuenta {
    int numCuenta;
    double Saldo;

    public Cuenta(int numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        Saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public boolean consignar(double cantidad, int cuenta){

        if(cuenta==getNumCuenta()){
                this.Saldo=this.Saldo+cantidad;
                setSaldo(this.Saldo);
                System.out.println("Transaccion exitosa\n" + "Su nuevo saldo es de $"+getSaldo() );
                return true;
        }else{
            return false;
        }
    }
}
