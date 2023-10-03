/*14 - Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa
deverá fazer uma busca do valor de X no vetor lido e informar a posição em que foi
encontrado ou se não foi encontrado.
 */

import java.util.Random;
import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
     int posicao = 0;    
     Scanner leia = new Scanner(System.in);
     Random numeros = new Random();
        
        int[] vetor = new int[20]; 
        
       
        for (int i = 0; i < 20; i++) {
            vetor[i] = numeros.nextInt(100) + 1;
        }
        
            System.out.println("NUMEROS GERADOS :");
                for (int i = 0; i < 20; i++) {
                System.out.print(vetor[i] + " ");
                }
                System.out.println("");
                
                System.out.println("Escreva o valor que deseja buscar: ");
                int busca = leia.nextInt();
        
        
       
                for (int i = 0; i < 20; i++) {
                    if (vetor[i] == busca) {
                    posicao = i + 1; 
                    break; 
                    }
                }
        
        
            if (posicao > 0) {
                System.out.println("O numero " + busca + " existe esta na está na posição:  " + posicao);
            } else {
            System.out.println("O valor " + busca + " não existe nos numeros citados.");
            }
        
    
            leia.close();      
    }
}
