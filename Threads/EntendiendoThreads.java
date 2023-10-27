package Threads;

public class EntendiendoThreads {
    public void mostrar0(){
        for(int f = 1; f <= 1000; f++){
            System.out.print("0-");
        }
    }

    public void mostrar1(){
        for(int f = 1; f <= 1000; f++){
            System.out.print("1-");
        }
    }

    public static void main(String[]args){
        EntendiendoThreads m = new EntendiendoThreads();
        m.mostrar0();
        m.mostrar1();
    }
}
