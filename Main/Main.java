package Main;

import java.util.ArrayList;

import Transportes.Carro;
import Transportes.Motocicleta;
import Transportes.Transporte;

public class Main {
    // Arraylist de objetos Transporte
    public static ArrayList<Transporte> vehiculos = new ArrayList<Transporte>();

    public static void main(String[] args) {
        Carro carro1 = new Carro("Jeep", "Liberty", "2012", "5");
        Motocicleta moto1 = new Motocicleta("Honda", "CBR 600 RR", "2013","4 Tiempos, 4 cilindros en linea, DOHC, 16 válvulas");

        vehiculos.add(carro1);

        System.out.println("***** Lista de carros *****");
        for (Transporte vehiculoCarro : vehiculos) {
            System.out.print("Marca: " + vehiculoCarro.getMarca() + "\n" +
                    "Modelo: " + vehiculoCarro.getModelo() + "\n" +
                    "Anio de Fabricacion: " + vehiculoCarro.getAnioFab() + "\n" +
                    "Numero de Puertas: " + vehiculoCarro.NumPuertas + "\n\n");
        }

        vehiculos.add(moto1);
        System.out.println("***** Lista de motocicletas *****");
        for(Transporte vehiculoMoto: vehiculos){
            System.out.print("Marca: " + vehiculoMoto.getMarca() + "\n" +
                    "Modelo: " + vehiculoMoto.getModelo() + "\n" +
                    "Anio de Fabricacion: " + vehiculoMoto.getAnioFab() + "\n" +
                    "Numero de Puertas: " + moto1.getTipoMotor() + "\n\n");
        }
    }

}
