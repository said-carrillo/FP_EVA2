/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_24_ciclo_infinito;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_24_ciclo_infinito {
    final static String Usuario = "admin";
    final static String pdw = "admin";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
         String usu, contra;
         while(true){
         System.out.println("Acceso al sistema----------");
         System.out.println("Usuario: ");
         usu = captu.nextLine();
         System.out.println("contraseña: ");
         contra = captu.nextLine();
         if(usu.equals(Usuario) && contra.equals(pdw))
            break;// termina el ciclo
    }
         System.out.println("bienvenido al sistema: ");
    }
    
}
