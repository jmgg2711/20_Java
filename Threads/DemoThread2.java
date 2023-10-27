package Threads;

public class DemoThread2 implements Runnable {
    private String nombre;

    public DemoThread2(String nombre){
        this.nombre = nombre;
    }

    public void run(){
        try {
            int x = (int)(Math.random()*5000);
            Thread.sleep(x);
            System.out.println("Soy: " + nombre + " (" + x + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new DemoThread2("Juan"));
        Thread t2 = new Thread(new DemoThread2("Niza"));
        Thread t3 = new Thread(new DemoThread2("Moka"));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final de Programa!");
    }
    
}
