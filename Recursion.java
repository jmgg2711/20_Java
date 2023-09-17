/*
 * ITSTEP COMPUTER ACADEMY
 * Materia: Bases de datos avanzadas
 * Archivo: RECURSION.JAVA
 * Fecha: 08/09/2023
 * Alumno: Gutiérrez Gallegos Juan Manuel
 * 
 * Descripción: Función recursiva para calcular la suma de los números 
 *      enteros desde 1 hasta un número dado (num):
 *          num = 8
 *          Entonces:
 *          Suma = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 */

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num = 0;        

        do{
            System.out.print("Introduce numero: ");
            num = entrada.nextInt();
        }while (num <= 0);
        System.out.println("La suma de " + num + " hasta 1 es igual a " + sRec(num));

        entrada.close();
    }
    
    public static int sRec(int num){
        if(num == 1){
            return 1;
        } else {
            return num + sRec(num - 1);
        }
    }
}
