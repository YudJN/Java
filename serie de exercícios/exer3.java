
/* Crie um programa que peça um número ao usuário e armazene ele na variável
x. Depois peça outro número e armazene na variável y. Mostre esses números.
Em seguida, faça com que x passe a ter o valor de y, e que y passe a ter o valor
de x */

import java.util.Scanner;

public class exer3 {

public static void main(String[] args) {
Scanner leia = new Scanner(System.in); 

    int Z = 0;
    
    System.out.println("Digite um numero");
    int Y = leia.nextInt();

    System.out.println("Digite outro numero");
    int X = leia.nextInt(); 

    System.out.println("Esses são os numeros digitados");
    System.out.println("");
    System.out.println("Esse é o valor de Y: " + Y);
    System.out.println("");
    System.out.println("Esse é o valor de X: " +X);

    Z = X;
    X = Y;
    
    System.out.println("");
    System.out.println("Esse é o valor de X invertido: " + X);
    System.out.println("");
    System.out.println("Esse é o valor de Y invertido: " + Z);








    leia.close();
}
}