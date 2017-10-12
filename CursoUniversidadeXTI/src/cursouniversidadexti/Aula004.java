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
public class Aula004 {
    public static void main(String[] args) {
        
        //Classes Wrapper
        //Wrapper
        
        //int idade = 24;
        Integer idade = new Integer (24);
        
        //double preco = 12.45;
        Double preco = new Double ("12.45");
        
        double d = preco.doubleValue();
        int i = preco.intValue();
        byte b = preco.byteValue();
        
        //boolean solteiro = true;
        Boolean solteiro = new Boolean ("true");
        
        //CONVERSÃO ESTÁTICA
        double d1 = Double.parseDouble("123.45");
        int i1 = Integer.parseInt("123");
        float f1 = Float.parseFloat("3.14F");
        
        int i2 = Integer.valueOf("101011", 2);
        
    }
}
