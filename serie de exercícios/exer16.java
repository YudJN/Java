/*16 - Crie um programa que solicite a entrada de 10 números pelo usuário,
armazenando-os em um vetor, e então monte outro vetor com os valores do primeiro
multiplicados por 5. Exiba os valores dos dois vetores na tela, simultaneamente, em
duas colunas (um em cada coluna), uma posição por linha.  */

import java.util.Random;
import java.util.Scanner;

public class exer16 {
    
    public static void main(String[] args) {   
     Scanner leia = new Scanner(System.in);
     Random numeros = new Random();
        
        int[] vetor = new int[10]; 
        int[] vetor2 = new int[10];
       
        for (int i = 0; i < 10; i++) {
            vetor[i] = numeros.nextInt(100) + 1;
        } 

            for (int i = 0; i < 10; i++) {
                vetor2 [i] = vetor[i] * 5;
            }


            System.out.println("=====================================");
             System.out.println("Vetor Original | Vetor Multiplicado");
           System.out.println("=====================================");
            
         for (int i = 0; i < vetor.length; i++) {
             System.out.print(String.format("%9s  ", vetor[i]) + "  | " + (String.format("%10s  ", vetor2[i])));
             System.out.println(" ");
          }
         
leia.close();
 }
}
