/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursouniversidadexti;

import java.util.ArrayList;

/**
 *
 * @author Alan Cardoso
 */
public class ArreyList {
    public static void main(String[] args) {
        
       ArrayList<String> cores = new ArrayList<>();
       cores.add("Branco");
       cores.add(0, "Vermelho");
       cores.add("Amarelo");
       cores.add("Azul");
       
       //Mostra as cores dentro do Array 
       System.out.println(cores.toString());
       
       //Mosta a quantidade de cores no Array
        System.out.println("Tamanho" + cores.size());
        
        System.out.println("Elemento2" + cores.get(2));
        
        System.out.println("Indice Branco= " + cores.indexOf());
        
        //Remove elementos no Array
        cores.remove(Amarelo);
        
        System.out.println("Tem Cinza? " + cores.contains("Conza"));
        
    }
}
