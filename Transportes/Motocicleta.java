package Transportes;

public class Motocicleta extends Transporte {
    // Declaración de atributos
    private String TipoMotor;

    // Declaración de contructores
    public Motocicleta() {
        super();
    }

    public Motocicleta(String _marca, String _modelo, String _anioFab, String _tipoMotor) {
        super(_marca, _modelo, _anioFab);
        this.TipoMotor = _tipoMotor;
    }

    // getters
    public String getTipoMotor() {
        return TipoMotor;
    }

    // setters
    public void setTipoMotor(String _tipoMotor) {
        this.TipoMotor = _tipoMotor;
    }
}
