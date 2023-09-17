import java.util.Scanner;

public class DemoArray2 {
    public static void main(String[] args){
        String dias[] = {"LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de la semana: ");
        int val = entrada.nextInt();
        entrada.close();

        //System.out.println(dias.length);
        if(val <= dias.length){
            System.out.println(dias[val-1]);
        } else {
            System.out.println("Un numero valido de dia es entre 1 y 7");
        }

    }
}
