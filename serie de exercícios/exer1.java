
/* - Faça um programa que peça dois números ao usuário e mostre qual o maior e
qual o menor */ 

import java.util.Scanner;

public class exer1 {

    public static void main(String[] args) {
       
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero");
        int number1 = leia.nextInt();

        System.out.println("Digite outro numero");
        int number2 = leia.nextInt(); 


    if (number1 > number2){

        System.out.println("O primeiro numero é maior");
    }else if(number1 < number2){

       System.out.println("O segundo numero é maior"); 
    
    }else{
         System.out.println("Os numeros são iguais ");
    }





    leia.close();

}




}
