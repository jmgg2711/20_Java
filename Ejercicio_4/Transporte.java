package Ejercicio_4;

/*
 * 1.Crea una clase base llamada Transporte que tenga los siguientes atributos:
 * - Marca
 * - Modelo
 * - Año de fabricación
 *
 * 2.En la clase Transporte, implementa un constructor para inicializar estos atributos 
 * y métodos getter y setter para acceder a ellos.
 *
 * 3.Crea dos clases derivadas: Carro y Motocicleta. Ambas clases deben heredar de la clase Transporte.
 *   
 * 4.En las clases derivadas, agrega atributos específicos:
 * - Carro debe tener un atributo para el número de puertas.
 * - Motocicleta debe tener un atributo para el tipo de motor (por ejemplo, "2 tiempos" o "4 tiempos").
 *
 * 5.Implementa constructores en las clases derivadas para inicializar sus atributos específicos, y 
 * asegúrate de que llamen al constructor de la clase base (Transporte) utilizando super().
 *
 * 6.Crea un programa principal (main) que permita al usuario realizar las siguientes operaciones:
 * - Agregar un carro a una lista.
 * - Agregar una motocicleta a otra lista.
 * - Mostrar la lista de carros y motocicletas ingresados, incluyendo sus atributos específicos.
 *
 * 7.Utiliza ArrayList para almacenar los carros y motocicletas ingresados.
 */

public class Transporte {
    //Definición de atributos
    protected String Marca;
    protected String Modelo;
    protected String AnioFab;

    public Transporte(){
    }

    public Transporte(String _marca, String _modelo, String _anioFab){
        this.Marca = _marca;
        this.Modelo = _modelo;
        this.AnioFab = _anioFab;
    }

    // getters
    public String getMarca(){
        return Marca;
    }
    
    public String getModelo(){
        return Modelo;
    }

    public String getAnioFab(){
        return AnioFab;
    }

    // setters
    public void setMarca(String _marca){
        Marca = _marca;
    }

    public void setModelo(String _modelo){
        Modelo = _modelo;
    }

    public void setAnioFab(String _anioFab){
        AnioFab = _anioFab; 
    }
    
    
}
