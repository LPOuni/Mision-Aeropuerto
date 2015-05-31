package pe.uni.fiis.aplicacion;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Junior Raúl on 31/05/2015.
 */
public class ExcelHorario {

    public static void main(String[] args) {

        //DANDOLE UN VALOR AL tipo de control de horarios(sea horario de entrada o de salida
        String tipo="Entrada";
        //En este caso le asignamos el valor del horario de "Entrada"

        HorariosEntradaSalida h = new HorariosEntradaSalida();
        Workbook wb = new HSSFWorkbook();
        try {
            FileOutputStream fileOut = new FileOutputStream("AeropuertoExcel.xls");
            Sheet hoja0 = wb.createSheet("HOJA 0");
            Row fila;
            Cell celda;
            Font fuente = wb.createFont();
            fuente.setFontHeightInPoints((short) 16);
            fuente.setFontName("Arial");

            fila = hoja0.createRow(3);
            celda = fila.createCell(2);
            celda.setCellType(HSSFCell.CELL_TYPE_STRING);
            celda.setCellValue("HORA de Entrada");
            celda = fila.createCell(4);
            celda.setCellValue("HORA de Salida");

            fila = hoja0.createRow(4);
            celda.setCellType(HSSFCell.CELL_TYPE_STRING);
            celda = fila.createCell(2);
            if(tipo.equals("Entrada")){
                h.Hora(tipo);
                celda.setCellValue(h.getEntrada());
                celda = fila.createCell(4);
            }
            if(tipo.equals("Salida")){
            h.Hora(tipo);
            celda.setCellValue(h.getSalida());}
            wb.write(fileOut);
            fileOut.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}