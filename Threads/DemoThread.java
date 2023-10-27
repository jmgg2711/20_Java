package Threads;

public class DemoThread extends Thread {
    private String nombre;

    public DemoThread(String nombre){
        this.nombre = nombre;
    }

    public void run(){
        try{
            int x = (int)(Math.random()*1000);
            Thread.sleep(x);
            System.out.println("Soy " + nombre + " ( " + x + " )");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
        DemoThread t1 = new DemoThread("Juan");
        DemoThread t2 = new DemoThread("Amy");
        DemoThread t3 = new DemoThread("Pedro");

        t1.start();
        t2.start();
        t3.start();
    }
    
}
