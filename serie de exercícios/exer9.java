/*- Faça um programa que recebe a altura de um triângulo em um número inteiro e
imprima-o utilizando asteriscos. Veja o Exemplo:
Entrada: 5
 */

import java.util.Scanner;

public class exer9 {
    
    public static void main(String[] args) {
Scanner leia = new Scanner(System.in);    

    System.out.print("Digite o altura do triangulo de 1 a 20: ");
    int quad = leia.nextInt();

    for (int i = 1; i <= quad ; i++) {
        for (int col = 1; col <= i; col++) {
         System.out.print("*");         
        }
        System.out.println("");
    
    }



leia.close();
}
}
