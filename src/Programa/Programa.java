package Programa;

import java.util.Scanner;

import Classes.Quadrado;
import Classes.Circulo;

public class Programa {
    public static void main(String[] args) {
        int opcao = -1;
        Scanner ler = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();
            
            System.out.println("------------------------------------");
            System.out.println("1 - Para calcular a area do quadrado");
            System.out.println("2 - Para calcular a area do circulo ");
            System.out.println("------------------------------------");
            opcao = ler.nextInt();
            

         
         switch (opcao){
             case 0:
             System.out.println("Encerrando");
             break;
             case 1:
             System.out.println("\n(Fazendo Area)");
             System.out.printf("\nDigite o valor do Lado do quadrado");
             quadrado.setLado(ler.nextDouble());
             System.out.println("-----------------------------------");
             System.out.println("\nO valor da sua area é: " + quadrado.calcularArea() + " Cm²");
             System.out.println("\nO calculo usado foi: " + quadrado.explicarMetodo());

             System.out.println("\n-------------------------------------------------");
             System.out.println("Deseja fazer o calculo da area do circulo? Digite 2");
             System.out.println("Não! Digite 0");
             opcao = ler.nextInt();
             
             if (opcao == 0){
                 System.out.println("\nEncerrando!!");
                 ler.close();
                 return;     
             }
             case 2:
             System.out.println("\n(Fazendo Circulo)");
             System.out.println("\nDigite o valo do raio");
             circulo.setRaio(ler.nextDouble());
             System.out.println("------------------------------------------------------");
             System.out.println("O valor da sua area é: " + circulo.calcularArea());
             System.out.println("O calculo usado foi: " + circulo.explicarMetodo());
       
             System.out.println("\n----------------------------------------------------");
             System.out.println("\nDeseja fazer o calculo da area do quadrado? Digite 2");
             System.out.println("Não! Digite 0");
             opcao = ler.nextInt();
             if (opcao == 0){
                System.out.println("Encerrando!!");
                ler.close();
                return;        
         }
        
        ler.close();
    }
    
}
}
