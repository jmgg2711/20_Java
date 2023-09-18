package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        CuentaBancaria oCuentaBancaria = new CuentaBancaria("1234-5678-9012-3456", 12345.65);
                Scanner entrada = new Scanner(System.in);

        System.out.println("***** Información de la cuenta *****");
        System.out.println("Número de cuenta: " + oCuentaBancaria.getNumeroCuenta());
        System.out.println("Saldo actual: $" + oCuentaBancaria.getSaldo());

        System.out.print("Deposito: ");
        double dCantidad = entrada.nextDouble();
        oCuentaBancaria.depositar(dCantidad);
        System.out.println();

        System.out.print("Retiro: ");
        dCantidad = entrada.nextDouble();
        oCuentaBancaria.retirar(dCantidad);
        System.out.println();

        System.out.print("Retiro: ");
        dCantidad = entrada.nextDouble();
        oCuentaBancaria.retirar(dCantidad);
        System.out.println();
        
        entrada.close();
    }
    
}
