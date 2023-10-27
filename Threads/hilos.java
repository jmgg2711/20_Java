package Threads;

public class hilos {
    public static void main(String[] args) {
        // Crear dos objetos Runnable
        Runnable tarea1 = new MiRunnable("Thread 1");
        Runnable tarea2 = new MiRunnable("Thread 2");

        // Crear dos threads y asignarles las tareas Runnable
        Thread thread1 = new Thread(tarea1);
        Thread thread2 = new Thread(tarea2);

        // Iniciar los threads
        thread1.start();
        thread2.start();
    }
}

class MiRunnable implements Runnable {
    private String nombre;

    public MiRunnable(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + ": Contador " + i + "\n");

            try {
                // Agregar pausa para simular una tarea
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(nombre + " fue interrumpido.");
            }
        }
    }
}
