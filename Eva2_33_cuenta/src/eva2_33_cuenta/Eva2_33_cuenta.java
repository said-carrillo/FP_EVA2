/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_33_cuenta;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_33_cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner captu = new Scanner(System.in);
        int cuenta = 1000000, num;
        while(cuenta > 0){
        System.out.println(cuenta);
        System.out.println("cuanto quieres retirar? ");
        num = captu.nextInt();
        if (num <= 0) {
                System.out.println("Cantidad inválida. debes ingresar un número positivo:");
                continue;
            }
            if (num > cuenta) {
                System.out.println("no puedes retirar dinero que no tienes en la cuenta");
                continue;
            }
            cuenta -= num;
            System.out.println("Saldo: " + cuenta);
        }
        System.out.println("Tu cuenta ha quedado en 0");
    }
}