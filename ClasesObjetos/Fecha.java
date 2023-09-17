package ClasesObjetos;

public class Fecha{
    //Definición de atributos 
    private int dia;
    private int mes;
    private int anio;

    // Constructor vacío
    public Fecha(){

    }

    public Fecha(int _dia, int _mes, int _anio){
        this.dia = _dia;
        this.mes = _mes;
        this.anio = _anio;
    }

    public Fecha(String _sFecha){
        // Buscar la primera ocurrencia de '/'
        int pos1 = _sFecha.indexOf('/');

        // Buscar la última ocurrencia de '/'
        int pos2 = _sFecha.lastIndexOf('/');

        // se procesa el día 
        String sDia = _sFecha.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        // se procesa el mes
        String sMes = _sFecha.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(sMes);

        // se procesa el anio
        String sAnio = _sFecha.substring(pos2 + 1);
        anio = Integer.parseInt(sAnio);
    }

    // setters
    public void setDia(int _dia){ this.dia = _dia; }
    public void setMes(int _mes){ this.mes = _mes; }
    public void setAnio(int _anio){ this.anio = _anio; }

    // getters
    public int getDia(){ return dia; }
    public int getMes(){ return mes; }
    public int getAnio(){ return anio; }

    // Métodos
    public String toString(){
        // Retorna una cadena tal como queremos que se vea la fecha
        return dia + "/" + mes + "/" + anio;
    }

    public boolean equals(Object o){
        Fecha otra = (Fecha)o;
        return (dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio);
    }

    private int fechaToDias(){
        return anio * 360 + mes * 30 + dia;
    }

    private void diasToFecha(int _iNumDiaFecha){
        // se divide por 360 para obtener el mes
        anio = (int)_iNumDiaFecha/360;

        // del resto de la division anterior, se obtiene 
        // el mes y el día
        int resto = _iNumDiaFecha % 360;

        // el mes es el resto devidido entre 30
        int mes = (int)resto / 30;

        // el resto de la división anterior son los días
        dia = resto % 30;

        // ajuste por si dia quedó en cero
        if(dia == 0){
            dia = 30;
            mes--;
        }

        // ajuste por si el mes quedó en cero
        if (mes == 0){
            mes = 12;
            anio--;
        }
    }

    public void addDias(int _iDiasToAdd){
    // convierte la fecha a dias y le suma _iDiasToAdd
        int sum = fechaToDias() + _iDiasToAdd;

    // la fecha resultante (sum) se separa en dia, mes y anio
        diasToFecha(sum);
    }


}
