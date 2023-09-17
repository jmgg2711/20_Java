package ClasesObjetos;

import java.util.Scanner;

public class TestFecha4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        // el usuariao ingresa los datos de la fecha
        System.out.print("Ingrese fecha (dd/mm/aaaa): ");

        // leo la fecha (cadena de caracteres) ingresada
        String sFecha = entrada.nextLine();

        // se crea objeto de la clase Fecha
        Fecha f = new Fecha(sFecha);

        // se muestra
        System.out.println("La fecha ingresada es: " + f);

        // el usuario ingresa una cantidad de dias a sumar
        System.out.print("Ingresa días a sumar (puede ser negativo): ");
        int diasSum = entrada.nextInt();

        entrada.close();
        
        // le sumo los dias a la fecha
        f.addDias(diasSum);

        // muestro la nueva fecha (con los dias sumados)
        System.out.println("sumando " + diasSum + " dias, queda: " + f);
    }
}
