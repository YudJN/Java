



import java.util.Scanner;

public class maior {


    public static void main(String[] args) {
 
    double number = 0, maiornumber = 0, repeticoes = 1;   

    Scanner leia = new Scanner (System.in);    
    
    System.out.println ("------------( MAIO NÚMERO ENTRE OS 3 )------------");
    
    
        for (int i = 1; i <= 3; i++) {

            System.out.println("Digite um valor: ");
            number = leia.nextInt(); 
            System.out.println ("--------------------------------------------------");
                
                if (number > maiornumber) {
                 maiornumber = number;
                 repeticoes = 1;
                }else if (number == maiornumber) {
                repeticoes++;                          
  
                }     
        }
    
        
            System.out.println ("RESULTADO DO MAIOR *-*");
            System.out.println ("");
            System.out.println ("Maior número entre os 3: " + maiornumber);
            System.out.println(""); 
            
            if (repeticoes > 1) {
                System.out.println("O maior número se repete " + repeticoes + " vezes.");
                System.out.println(""); 

            }    
   
   
   
    }


}       




