package Banco;

import java.text.DecimalFormat;

public class CuentaBancaria {
    //#region Delcaración de atributos
    private double saldo;
    private String numeroCuenta;
    //#endregion

    //#region Constructores
    public CuentaBancaria(String _numeroCuenta, double _saldo){
        this.numeroCuenta = _numeroCuenta;
        this.saldo = _saldo;
    }
    
    //#region getter
    public double getSaldo(){
        return saldo;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    //#endregion
    
    //#region Métodos
    public void depositar(double _cantidad){
        DecimalFormat df = new DecimalFormat("#.##");
        double cantidad;
        cantidad = _cantidad;

        System.out.println("Cuenta: " + numeroCuenta);
        System.out.print("Saldo anterior: $" + df.format(getSaldo()));
        saldo = saldo + cantidad;
        System.out.println("\nSaldo actual: $" + df.format(getSaldo()));
    }

    public void retirar(double _cantidad){
        DecimalFormat df = new DecimalFormat("#.##");
        double cantidad;
        cantidad = _cantidad;

        System.out.println("Cuenta: " + numeroCuenta);
        System.out.print("Saldo anterior: $" + df.format(getSaldo()));
        
        if(saldo < cantidad){
            System.out.println("\n¡No hay fondos suficientes!");
        }else {
            saldo = saldo - cantidad;
            System.out.println("\nSaldo actual: $" + df.format(getSaldo()));
        }
    }
    //#endregion
}
