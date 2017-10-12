/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursouniversidadexti;

/**
 *
 * @author Alan Cardoso
 */
public class Aula_Foreach {
    public static void main(String[] args) {
        
        //foreach
        int[] pares = {2,4,6,8};
        for (int i=0; i<pares.length; i++){
             int par = pares[i];
            System.out.println(par);
        }
        
        //For Aprimorado
        for (int par : pares) {
            System.out.println(par);
        }
    }
}
