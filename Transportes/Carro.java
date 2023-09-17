package Transportes;

public class Carro extends Transporte {
    // Declaración de atributos
    public String NumPuertas;

    // Declaración de constructores
    public Carro() {
        super();
    }

    public Carro(String _marca, String _modelo, String _anioFab, String NumPuertas) {
        super(_marca, _modelo, _anioFab);
        this.NumPuertas = NumPuertas;
    }

    // getters
    public String getNumPuertas() {
        return this.NumPuertas;
    }

    // setters
    public void setNumPuertas(String _numPuertas) {
        this.NumPuertas = _numPuertas;
    }

    public void holaMundo() {
        System.out.println("Hola Mundo from CARRO!");
    }
}
