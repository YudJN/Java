import java.util.Scanner;

public class exer4 {
    
public static void main(String[] args) {
    
int number = 10; 
int maiornumber = 0;
int repeticoes = 1;

       

Scanner leia = new Scanner (System.in); 

    while (number != 0) {

        System.out.println ("Digite um número inteiro:");
        number = leia.nextInt();
    
        if (number > maiornumber) {
            maiornumber = number;
            repeticoes = 1;
           
        }else if (number == maiornumber) {
           repeticoes++;
                                    

           }     
   }
    
    System.out.println ("----------------------------------------");
    System.out.println ("Maior numero digitado é :" + maiornumber);

    if (repeticoes > 1){ 
        System.out.println("O maior número se repete " + repeticoes + " vezes.");
        System.out.println(""); 
    }

leia.close ();   

}



}
