package Excepciones;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        char cOpc;
        int iOpc = 0;
        int iVal1 = 0;
        int iVal2 = 0;
        int iResultado = 0; 
        
        do{ 
            try {
                System.out.println("***** Calculadora básica *****");
                System.out.println("\t[1] - Suma.");
                System.out.println("\t[2] - División.");
                System.out.println("\t[0] - Salir.");
                System.out.print("Selecciona una opción: ");            
                cOpc = entrada.next().charAt(0);
                iOpc = (int)cOpc;
                System.out.println();
            
                if(iOpc > 48 && iOpc < 51){
                    System.out.print("Ingresa valor 1: ");
                    iVal1 = entrada.nextInt();
                    System.out.print("Ingresa valor 2: ");
                    iVal2 = entrada.nextInt();
                    System.out.println();
                }          
            
                switch(iOpc) {
                    case 48: 
                        System.out.println("Finaliza ejecución.");
                        break;
                    case 49:
                        iResultado = iVal1 + iVal2;
                        System.out.println("La suma " + iVal1 + " + " + iVal2 + " = " + iResultado);
                        break;
                    case 50:
                        iResultado = iVal1 / iVal2;
                        System.out.println("La división " + iVal1 + "/" + iVal2 + " = " + iResultado);
                        break;
                    default: 
                        System.out.println("¡Opción inválida!");
                }
                System.out.println();
            
            } catch (Exception e) {
                System.out.println("\nERROR: " + e + "\n");
            }
        }while(iOpc != 48);
        entrada.close();
    }
}
