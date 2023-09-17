package Ejercicio_4;

/*
 * Clase hija CARRO.JAVA 
 * Derivada de clase padre TRANSPORTE.JAVA
 */

 public class Carro extends Transporte {
    
    private int NumPuertas;

    public Carro(){
        super();
    }

    public Carro(String _marca, String _modelo, String _anioFab, int _numPuertas){
        super(_marca, _modelo, _anioFab);
        this.NumPuertas = _numPuertas; 
    }

    // getters
    public int getNumPuertas(){
        return NumPuertas;
    }

    // setters
    public void setNumPuertas(int _numPuertas){
        NumPuertas = _numPuertas;
    }
}
