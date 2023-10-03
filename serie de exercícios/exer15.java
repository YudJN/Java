/*15 - Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui. */

import java.util.Random;

public class exer15 {
    public static void main(String[] args) {
    int[] numerospares = new int[40];
    int contador = 0;
     Random randow = new Random();
    
  for ( contador = 0; contador < 40; contador++) {
         int numero = randow.nextInt(100) + 1;
       
    
        if (numero % 2 == 0) {
            numerospares[contador] = numero;
      
        contador++;
        } 
    }   
        
     

    for (int i = 0; i < 40; i++) {
    System.out.println("Numeros pares: " + numerospares[i]); 
    
    
    }

}
}