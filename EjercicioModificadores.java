class Calculadora {

    public int sumar(int val1, int val2){
        return val1 + val2;
    }

    private int restar(int val1, int val2){
        return val1 - val2;
    }

    int multiplicar(int val1, int val2){
        return val1 * val2;
    }
    
}

public class EjercicioModificadores {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        
        System.out.println(calculadora.sumar(3, 4));
        
        //System.out.println(calculadora.restar(6,8));
        
        System.out.println(calculadora.multiplicar(6,5));
    }
}
