package Ejercicio_4;

import java.util.ArrayList;

//import Ejercicio_4.Carro;
// import Ejercicio_4.Motocicleta;

public class Main {
    // Declaración de listas para Carros y Motos
    static ArrayList<Transporte> vehiculos = new ArrayList<>();
    //public static ArrayList<Transporte> lstMotos = new ArrayList<Transporte>();
    
    public static void main(String[] args){

        Carro carro1 = new Carro("Ford", "Focus", "2020", 4);
        Carro carro2 = new Carro("Jeep", "Liberty", "2015", 5);
        // Carro carro3 = new Carro("Nissan", "Sentra", "2022", 4);
        //Motocicleta moto1 = new Motocicleta("Honda", "CBR 600 RR", "2023", "4 Tiempos");
        // Motocicleta moto2 = new Motocicleta("Dinamo", "Chopper 250", "2022", "4 Tiempos");
        // Motocicleta moto3 = new Motocicleta("Vento", "Lithium", "2020", "3 Tiempos");

        //Agregar registros a listas 
        vehiculos.add(carro1);
        vehiculos.add(carro2);
        // lstVehiculos.add(carro3);
        //lstVehiculos.add(moto1);
        // lstVehiculos.add(moto2);
        // lstVehiculos.add(moto3);

        System.out.println("******* Listado de carros en la lista: *******");
        System.out.println();
        for(Transporte carro1 : vehiculos){}
        System.out.println("Marca: " + carro1.getMarca() + "\n" +
                            "Modelo: " + carro1.getModelo() + "\n" +
                            "Anio de Fabricacion: " + carro1.getAnioFab() + "\n" +
                            "Numero de puertas: " + carro1.getNumPuertas());
        System.out.println();
                            System.out.println("Marca: " + carro2.getMarca() + "\n" +
                            "Modelo: " + carro2.getModelo() + "\n" +
                            "Anio de Fabricacion: " + carro2.getAnioFab() + "\n" +
                            "Numero de puertas: " + carro2.getNumPuertas());

        // System.out.println("******* Listado de motocicletas en la lista: *******");
        // for(Transporte moto : lstVehiculos){
        //     System.out.println("Marca: " + "\n" +
        //                             "Modelo: " + "\n" +
        //                         "Anio de Fabricacion: " + "\n" +
        //                         "Tipo Motor: " + "\n");
        // }
    }
}
