package Threads;

import java.util.Scanner;

public class cronometro {

    public static void main(String[] args) {
        // Crear una instancia de la clase Cronometro
        CronometroThread cronometro = new CronometroThread();
        
        char StartCrono = 'x';

        System.out.println("\nIngresa [i] para iniciar ");  
        Scanner inStart = new Scanner(System.in);
        StartCrono = inStart.next().charAt(0);
        inStart.close();

        if(StartCrono=='i')
                    // Iniciar el cronómetro
                    cronometro.start();
        else
            System.out.println("\nNo iniciaste el cronometro");  
                  
        // Esperar unos segundos (simulando alguna actividad)
        try {
            Thread.sleep(10000); // Espera 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Detener el cronómetro
        cronometro.parar();
    }
}

class CronometroThread extends Thread {
    private long inicio;
    private boolean enEjecucion;

    public void run() {
        inicio = System.currentTimeMillis();
        enEjecucion = true;

        while (enEjecucion) {
            long tiempoTranscurrido = System.currentTimeMillis() - inicio;
            //System.out.println("Tiempo transcurrido: " + tiempoTranscurrido/1000 + " milisegundos");
            System.out.println("Tiempo transcurrido: " + tiempoTranscurrido/1000 + " segundos");
            
            try {
                Thread.sleep(1000); // Actualiza cada segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void parar() {
        enEjecucion = false;
    }
}