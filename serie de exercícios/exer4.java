/*Faça um programa que peça um número de 2 a 10 ao usuário e usando laços de repetição calcule e
mostre a tabuada desse número */
    
import java.util.Scanner;

public class exer4 {

public static void main(String[] args) {
Scanner leia = new Scanner(System.in); 


System.out.println("Digite um numero entre 2 e 10 ");
int number = leia.nextInt();
System.out.println("");
for (int i = 1; i < 11; i++) {

   int tabuada = number  *  i;
 
    System.out.println(tabuada);
    
}
leia.close();


}
}
