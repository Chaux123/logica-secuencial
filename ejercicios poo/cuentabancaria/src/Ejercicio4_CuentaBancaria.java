// Ejercicio 4. Cuenta Bancaria (Modificar atributos)

public class Ejercicio4_CuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("001-2345", "Carlos Pérez", 500000);

        cuenta1.mostrarInformacion();
        cuenta1.depositar(150000);
        cuenta1.retirar(200000);
        cuenta1.retirar(1000000); // fondos insuficientes
        cuenta1.mostrarInformacion();
    }
}

class CuentaBancaria {
    String numeroCuenta;
    String titular;
    double saldo;

    CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    void mostrarInformacion() {
        System.out.println("----- Cuenta Bancaria -----");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: $" + saldo);
    }

    void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser positivo.");
            return;
        }
        saldo += monto;
        System.out.println("Depósito de $" + monto + " realizado. Nuevo saldo: $" + saldo);
    }

    void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser positivo.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes para retirar $" + monto);
            return;
        }
        saldo -= monto;
        System.out.println("Retiro de $" + monto + " realizado. Nuevo saldo: $" + saldo);
    }
}
