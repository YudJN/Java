/*Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que
pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não. Use
alguns dos operadores lógicos OU (||) e E (&&). */

import java.util.Scanner;

public class exer2 {

public static void main(String[] args) {
Scanner leia = new Scanner(System.in);   

    System.out.println("Qual seria a sua idade: ");
    int number = leia.nextInt();

    if (number >= 18 && number <= 67 ) {

        System.out.println("Pode doar sangue! ");
        
    }else{

        System.out.println("NÃO PODE DOAR SANGUE!!!");
    }



    leia.close();
}
}