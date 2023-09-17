/*
 * Clase hija MOTOCICLETA.JAVA 
 * Derivada de clase padre TRANSPORTE.JAVA
 */

package Ejercicio_4;

public class Motocicleta extends Transporte {
    
    private String TipoMotor;

    public Motocicleta(){
        super();
    }

    public Motocicleta(String marca, String modelo, String anioFab, String tipoMotor){
        super(marca, modelo, anioFab);
        this.TipoMotor = tipoMotor;
    }

}
