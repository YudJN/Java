/*8 - Escreva um programa que lê o tamanho do lado de um quadrado e imprime um
quadrado daquele tamanho com asteriscos. Seu programa deve usar laços de repetição
e funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.
Por exemplo, para lado igual a 5: */

import java.util.Scanner;

public class exer8 {

public static void main(String[] args) {
Scanner leia = new Scanner(System.in);    

    System.out.print("Digite o tamanho do quadrado de 1 a 20: ");
    int quad = leia.nextInt();

    for (int i = 1; i <= quad ; i++) {
        for (int col = 1; col <= quad; col++) {
         System.out.print("*");         
        }
        System.out.println("");
    
    }



leia.close();

}    
}
