/*- 12- Declare um vetor de 10 posições e o preencha com os 10 primeiros números
ímpares e o escreva.
 */

public class exer12 {
    public static void main(String[] args) {
    int[] numerosImpares = new int[10];
    int contador = 0;
    
    
        for (int numero = 1 ; contador < 10 ; numero++) {
       
    
            if (numero % 2 == 1) {
            numerosImpares[contador] = numero;
      
            contador++;
            } 
        }   
        
     

        for (int i = 0; i < 10; i++) {
        System.out.println(numerosImpares[i]); 
    
    
        }

}
}