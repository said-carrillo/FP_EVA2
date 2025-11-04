/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_11_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int rep;
        String mensaje;
        System.out.println("Mensaje a repetir");
        mensaje = captu.nextLine();
        System.out.println("Cantidad da repetir");
        rep = captu.nextInt();
        for(int i = 1; i <= rep; i++)
            System.out.println(mensaje);
            
    }
    
}
