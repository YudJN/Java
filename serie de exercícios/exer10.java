import java.util.Scanner;

public class exer10 {

public static void main(String[] args) {
Scanner leia = new Scanner(System.in); 
  int idade  = 1, maior = 0, quantidade = 0; 
    
  
    while (idade != 0) {
        System.out.print(" Digite sua idade: ");
        idade = leia.nextInt(); 
        
        if (idade > 0) {
            
            quantidade++;
            maior = maior + idade;
        }
    }    

    double media = ( (double)maior / (double)quantidade); 


    System.out.println(" media das idades: " + media );

leia.close();
}
}