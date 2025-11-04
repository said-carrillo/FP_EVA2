/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_34_primo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_34_primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int n;
        System.out.println("Dime un número: ");
        n = captu.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < n; i++){
            int residuo = n % i;
            if(residuo == 0)
                esPrimo = false;
                        break;
        }
        if(esPrimo)
            System.out.println("el numero " + n + " es primo");
        else
            System.out.println("el numero " + n + " no es primo");
            
    }
    
}
