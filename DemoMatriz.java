import java.util.Scanner;

public class DemoMatriz {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese cantidad de filas: ");
        int nFilas = entrada.nextInt();

        System.out.print("Ingrese cantidad de columnas: ");
        int nColumnas = entrada.nextInt();

        entrada.close();

        // Se genera una matriz de 'n' filas x 'm' columnas 
        int matriz[][] = new int[nFilas][nColumnas];

        int num;
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                // genera un número aleatorio entre 0 y 1000
                num = (int)(Math.random() * 1000);
                // asigna número a la matriz
                matriz[i][j] = num;
            }
        }

        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                // Impresión de celdas de la matriz
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
