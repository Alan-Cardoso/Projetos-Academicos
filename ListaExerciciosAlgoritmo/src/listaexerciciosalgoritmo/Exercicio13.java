
package listaexerciciosalgoritmo;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
       double valorHoras;
       double horasTrabalhadas;
       
       Scanner valorTeclado = new Scanner(System.in);
        System.out.println("Digite o valor da hora em Reais:");
        valorHoras = valorTeclado.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas no mês: ");
        horasTrabalhadas = valorTeclado.nextDouble();
        
        double salarioBruto  = (valorHoras * horasTrabalhadas);
        String IR1 = "Isento" ;
        double IR2 = (salarioBruto * 5) / 100;
        double IR3 = (salarioBruto * 10) / 100;
        double IR4 = (salarioBruto * 20) / 100;
        double INSS = (salarioBruto * 10) /100;
        double FGTS = (salarioBruto * 1) / 100;
        
        System.out.println("Salário Bruto:" + salarioBruto);
        if(salarioBruto <= 900){
            System.out.println("(-) IR 	: " + IR1);
        }else if(salarioBruto > 900 || salarioBruto <= 1500){
           System.out.println("(-) IR (5%)	: R$ " + IR2);
        }else if(salarioBruto > 1500 || salarioBruto <= 2500){
           System.out.println("(-) IR (10%)	: R$ " + IR3); 
        }else if(salarioBruto > 2500){
           System.out.println("(-) IR (20%)	: R$ " + IR4); 
        }
        
        System.out.println("(-) INSS ( 10%)	: R$ " + INSS);
        System.out.println("FGTS (1%) : R$ " + FGTS);
        double descontos1 = INSS + FGTS;
        double descontos2 = IR2 + INSS + FGTS;
        double descontos3 = (IR3 + INSS + FGTS);
        double descontos4 = (IR4 + INSS + FGTS);
        
        if(salarioBruto <= 900){
            System.out.println("Total de descontos	: R$ " + descontos1);
        }else if(salarioBruto > 900 || salarioBruto <= 1500){
           System.out.println("Total de descontos	: R$ " + descontos2);
        }else if(salarioBruto > 1500 || salarioBruto <= 2500){
           System.out.println("Total de descontos	: R$ "+ descontos3);
        }else if(salarioBruto > 2500){
           System.out.println("Total de descontos	: R$ " + descontos4); 
        }
        if(salarioBruto <= 900){
            System.out.println("Salário Liquido	: R$ " + (salarioBruto - descontos1));
        }else if(salarioBruto > 900 || salarioBruto <= 1500){
           System.out.println("Salário Liquido	: R$ " + (salarioBruto - descontos2));
        }else if(salarioBruto > 1500 || salarioBruto <= 2500){
           System.out.println("Salário Liquido	: R$ " + (salarioBruto - descontos3));
        }else if(salarioBruto > 2500){
           System.out.println("Salário Liquido	: R$ " + (salarioBruto - descontos4)); 
        }
    }
}
