/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_25_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_25_adivinar_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);
        int val = 0, adivi;
        
        while(val != -1){
            adivi = (int)(Math.random() * 5);
            System.out.println("adivina el numera. -1 para terminar.");
            val = captu.nextInt();
            if(val == adivi)
                System.out.println("adivinaste!!");       
            
        }
    }
    
}
