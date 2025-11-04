/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_10_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        //
        //
        for(int i = 1; i <= 20; i++)
            System.out.print(i +"-");
        System.out.println("");
        for(int i = 20; i >= 1; i--)
            System.out.print(i + "-");
        System.out.println("");
        for(int i = 0; i <= 100;i+=2)
            System.out.print(i + "-");
        System.out.println("");
        for(int i = 100; i >= 0;i-=2)
            System.out.print(i + "-");
        System.out.println("");
         Scanner captu = new Scanner(System.in);
        int num, me;
        
        System.out.println("cantidad de numeros que deseas imprimir ");
        me = captu.nextInt();
        System.out.println("Cantidad a repetir");
        num = captu.nextInt();
        for(int i = me; i <= num; i++)
            System.out.println(me);
        
            
    }
    
}
