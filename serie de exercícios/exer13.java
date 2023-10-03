/*13 - Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos e
vice-e-versa. Escreva ao final o vetor obtido.
 */


public class exer13 {
    public static void main(String[] args) {
        int[] vetor = new int[16]; 

      
        for (int i = 0; i < 16; i++) {
            vetor[i] = i + 1;
        }

        
        for (int i = 0; i < 8; i++) {
            int troca = vetor[i];
            vetor[i] = vetor[i + 8];
            vetor[i + 8] = troca;
        }

       
        System.out.println("Depois da troca");
        for (int i = 0; i < 16; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
