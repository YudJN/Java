/*6 - Faça um programa que receba a idade de dez pessoas e que calcule e mostre a quantidade de
pessoas com idade maior ou igual a 18 anos. */

import java.util.Scanner;

public class exer6 {

public static void main(String[] args) {
Scanner leia = new Scanner(System.in); 
  int maioridade  = 0; 
    
  
        for (int i = 0; i < 10; i++) {
    
        System.out.println(" Digite sua idade: ");
        int idade = leia.nextInt();
            if (idade >= 18) {
                maioridade ++;
    
            }

    }
    System.out.println("Conteve " + maioridade + " uma pessoa 23com a idade maior que 18");

    leia.close();
}
}