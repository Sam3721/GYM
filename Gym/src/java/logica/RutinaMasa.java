/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author yerky vargas
 */
public class RutinaMasa extends Rutina {
     public List<String> crearRutinaExtendida() {
        List<String> rutina = crearRutina();
        // Agregar más ejercicios de peso
        rutina.add("Press militar 3X10");
        rutina.add("Remo con barra 4X8");
        rutina.add("Curl de bíceps 3X12");
        rutina.add("Fondos en paralelas 3X10");
        rutina.add("Elevaciones laterales 3X12");
        return rutina;
    }

    public static void main(String[] args) {
        RutinaMasa rutinaMasa = new RutinaMasa();
        List<String> rutinaExtendida = rutinaMasa.crearRutinaExtendida();
        rutinaMasa.mostrarRutina(rutinaExtendida);
    }
}
