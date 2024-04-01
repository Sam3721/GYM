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
public class Rutina {

    public static void main(String[] args) {
    
    
        }
        public static List<String> crearRutina() {
        List<String> rutina = new ArrayList<>();
        rutina.add("Jalón dorsal abierto 4X12");
        rutina.add("Press banca 3X8");
        rutina.add("Leg extension 4X12");
        rutina.add("Curl femoral 4X8");
        
        return rutina;
        
        }
        
       public static void mostrarRutina(List<String> rutina) {
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


