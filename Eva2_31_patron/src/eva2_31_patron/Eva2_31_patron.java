/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_31_patron;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_31_patron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int i = 1, n;
        System.out.println("Dime un número: ");
        n = captu.nextInt();
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
    }
        int k = n;
        while (k >= 1) {
            int j = 1;
            while (j <= k) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            k--;
        }
    }
}
        
    

