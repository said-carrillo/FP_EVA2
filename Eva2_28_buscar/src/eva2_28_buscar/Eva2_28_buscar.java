/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_28_buscar;

/**
 *
 * @author invitado
 */
public class Eva2_28_buscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valores[] = new int[10];
        int valor;
        for (int i = 0; i < valores.length; i++);{
            valores[i] = (int)(Math.random() * 100);
    }
        for (int i = 0; i < valores.length; i++);{
            System.out.println("[" + valores[i] + "]");
    }
        System.out.println("");
        System.out.println("valor a buscar");
        valor = captu.nextInt();
        for (int i = 0; i < valores.length; i++);{
            if(valor == valores[i]){
                System.out.println("valor a buscar");
                System.out.println("posicion" + i);
                break;
            }
    }
    
}
}
