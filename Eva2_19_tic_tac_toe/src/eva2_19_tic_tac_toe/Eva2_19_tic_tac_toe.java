/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_tic_tac_toe;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_19_tic_tac_toe {
    public static void main(String[] args) {
        int tictac[][] = new int[3][3];
        int fila, col, jug;
        Scanner captu = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("introduce tu jugada. fila: ");
            fila = captu.nextInt();
            System.out.println("introduce tu jugada. columna: ");
            col = captu.nextInt();
            System.out.println("jugador (1,2): ");
            jug = captu.nextInt();
            tictac[fila][col] = jug;
           
        }
        for(int i = 0; i < tictac.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                 System.out.print("[" + matriz[i][j] + "]");
        //for (int i = 0; i < tictac.length; i++) {
            //int[] is = tictac[i];
            
        }
    }
    
}
