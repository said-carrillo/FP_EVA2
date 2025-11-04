/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_27_break;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_27_break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int val, adivi;
        do{
            adivi = (int)(Math.random() * 5);
            System.out.println("adivina el numera. -1 para terminar.");
            val = captu.nextInt();
            if(val == adivi)
                System.out.println("adivinaste!!");
            else if(val == -1){
                System.out.println("gracias por jugar");
                break;
            }else{
                System.out.println("no adivinaste");
            
            }   
            }while(true);
        
        }
}
    

