package pe.uni.fiis.aplicacion;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Junior Raúl on 31/05/2015.
 */
public class HorariosEntradaSalida {
    private String entrada;
    private String salida;
    public void Hora (String tipo){
        Calendar cal= new GregorianCalendar();
        System.out.println(cal.get(Calendar.HOUR));

        if(tipo.equals("Entrada")){
            setEntrada(String.valueOf(cal.get(Calendar.HOUR))+":"
                    +String.valueOf(cal.get(Calendar.MINUTE))+":"
                    +String.valueOf(cal.get(Calendar.SECOND)));
        }
        if (tipo.equals("Salida")){
            setSalida(String.valueOf(cal.get(Calendar.HOUR))+":"
                    +String.valueOf(cal.get(Calendar.MINUTE))+":"
                    +String.valueOf(cal.get(Calendar.SECOND)));
        }
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
}
