package Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int resultado;

        Calculadora calc1 = new Calculadora(); 

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa valor 1: ");
        int oper1 = entrada.nextInt();
        
        System.out.println();
        
        System.out.print("Ingresa valor 2: ");
        int oper2 = entrada.nextInt();

        entrada.close();

        resultado = calc1.Suma(oper1, oper2);
        System.out.println("La suma de " + oper1 + " + " + oper2 + " = " + resultado);

        resultado = calc1.Resta(oper1, oper2);
        System.out.println("La resta de " + oper1 + " - " + oper2 + " = " + resultado);

    }
    
}
