
package listaexerciciosalgoritmo;

import java.util.Scanner;


public class Exercicio21 {
    public static void main(String[] args) {
        //Faça um Programa que peça uma data no formato d/m/a e determine se a mesma é uma data válida.
        
        int dia, mes, ano;
        
        Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Informe o dia: ");
        dia = valorTeclado.nextInt();
        System.out.println("Informe o mês: ");
        mes = valorTeclado.nextInt();
        System.out.println("Informe o ano: ");
        ano = valorTeclado.nextInt();
        
        boolean condicaoDia = dia >= 1 && dia <= 31;
        boolean condicaoMes = mes >= 1 && mes <= 12;
        boolean condicaoAno = ano > 0;
        
        if(condicaoDia && condicaoMes && condicaoAno){
            System.out.println("Data Válida!");
        }else{
            System.out.println("Data Inválida!");
        }
    }
}
