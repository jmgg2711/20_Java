package Fechas;

public class Fechas {
    private int dia;
    private int mes;
    private int anio;

    /**
     * Asigna el número de día del mes.
     * @param _dia Número de día del mes.
     */
    public void setDia(int _dia){
        this.dia = _dia;
    }

    /**
     * Obtiene el número correspondiente al día del mes
     * @return Número de día del mes
     */
    public int getDia(){
        return dia;
    }
    /**
     * Asigna el número de mes del año: 
     * 1 - Enero, 2 - Febrero, ... , 12 - Diciembre
     * @param _mes Número de mes del año
     */
    public void setMes(int _mes){
        this.mes = _mes;
    }

    /**
     * Obtiene el número correspondiente al mes del año
     * @return  Número del mes del año:
     *          1 - Enero, 2 - Febrero, ... , 12 - Diciembre
     */
    public int getMes(){
        return mes;
    }
    /**
     * Asigna el número del año en formato 'aaaa'
     * @param _anio Número del año con cuatro dígitos
     */
    public void setAnio(int _anio){
        this.anio = _anio;
    }
    /**
     * Obtiene el número correspondiente al año 
     * @return Número del año en cuatro dígitos
     */
    public int getAnio(){
        return anio;
    }
}
