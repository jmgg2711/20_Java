package Fechas;

public class TestFechas {
    public static void main(String[] args){
        Fechas f = new Fechas();

        f.setDia(27);
        f.setMes(11);
        f.setAnio(1976);

        System.out.println("Día: " + f.getDia());
        System.out.println("Mes: " + f.getMes());
        System.out.println("Año: " + f.getAnio());
    }
}
