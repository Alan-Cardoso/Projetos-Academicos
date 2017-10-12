/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursouniversidadexti;

import java.util.Arrays;

/**
 *
 * @author Alan Cardoso
 */
public class ArraySimples {
    public static void main(String[] args) {
        
        int[] impares = new int [5];
        impares [0] = 1;
        impares [1] = 3;
        impares [2] = 5;
        impares [3] = 7;
        impares [4] = 9;
        
        
        String[] paises = {"Brasil", "Rússis", "Índia", "Chins"};
        System.out.println(paises [0]);
        System.out.println(Arrays.toString(paises));
        
        //localizar um elemendo detrode um Array
        int posicao = Arrays.binarySearch(paises, "Rússia");
        System.out.println(posicao);
    }
}
