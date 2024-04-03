/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author yerky vargas
 */
public class RutinaPeso extends Rutina{
     @Override
     public List<String> crearRutina() {
        List<String> rutina = new ArrayList();
       
        rutina.add("Press militar 3X10");
        rutina.add("Remo con barra 4X8");
        rutina.add("Curl de bíceps 3X12");
        rutina.add("Fondos en paralelas 3X10");
        rutina.add("Elevaciones laterales 3X12");
        return rutina;
    }
     @Override
      public void mostrarRutina(List<String> rutina) {
        Collections.shuffle(rutina);

       
        int contador = 0;
        for (String elemento : rutina) {
            System.out.print(elemento + " ");
            contador++;
            
            if (contador % 5 == 0) {
                System.out.println();
            }
        }
    }
}
