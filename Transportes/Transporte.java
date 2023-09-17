package Transportes;

public class Transporte {
    // Declaración de atributos
    protected String Marca;
    protected String Modelo;
    protected String AnioFab;

    // Declaración de constructores
    public Transporte() {
    }

    public Transporte(String _marca, String _modelo, String _anioFab) {
        this.Marca = _marca;
        this.Modelo = _modelo;
        this.AnioFab = _anioFab;
    }

    // getters
    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getAnioFab() {
        return AnioFab;
    }

    // setters
    public void setMarca(String _marca) {
        Marca = _marca;
    }

    public void setModelo(String _modelo) {
        Modelo = _modelo;
    }

    public void setAnioFab(String _anioFab) {
        AnioFab = _anioFab;
    }
}
