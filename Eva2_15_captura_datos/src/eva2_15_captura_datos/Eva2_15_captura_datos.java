/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_15_captura_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int tama;
        System.out.println("¿cuantas calificaciones quieres capturar?");
        tama = captu.nextInt();
        int califas [] = new int[tama];
        for(int i = 0; i < califas.length; i++){
             System.out.println("calificaciones #" + (i + 1) + ":");
             califas[i] = captu.nextInt();    
        }
        for(int i = 0; i < califas.length; i++){
             System.out.print("[" + califas[i] + "]");
            
        }
        // promedio del grupo?
        //SUMAR TODAS LAS CALIFICACIONES
        int sumaCalif;
        for(int i = 0; i < califas.length; i++){
            //sumaCalifas = sumaCalifas + califas[1];
            sumaCalif += califas[1];
        }
        System.out.println("acumulado = " + sumaCalif);
        double promedio = sumaCalif / (double)califas.length;
        System.out.println("promedio: " + promedio);
    }
    
}
