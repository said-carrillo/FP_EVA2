/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_20_do_.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_20_do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("menu principal -----------");
        System.out.println("Preciona la opcion");
        System.out.println("1 - pedidos");
        System.out.println("2 - proovedores");
        System.out.println("3 - facturacion");
        System.out.println("4 - salir");
        opcion = captu.nextInt();
        }while(opcion != 4);//mientras esta obcion sea diferente a 4
        System.out.println("Fin del programa!!");
        switch(opcion){
            case 1:
                System.out.println("pedidos del sistema¡¡");
                break;
            case 2:
                System.out.println("proovedores del sistema¡¡");
                break;
            case 3:
                System.out.println("Facturacion del sistema¡¡");
                break;
        } 
        
    
    }
        
    }
    

