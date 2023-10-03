/*11- Faça um programa que apresente um menu de opções para o cálculo das
seguintes operações entre dois números: adição, subtração, multiplicação e
divisão. O programa deve usar laços de repetição para possibilitar ao usuário a
escolha da operação desejada, a exibição do resultado e a volta ao menu de
opções. O programa só termina quando for escolhida a opção de saída.  */
    



import java.util.Scanner;

public class exer11 {


    public static void main(String[] args) {
        
    Scanner leia = new Scanner(System.in);    
    double result = 0, Y = 0, X = 0;
    int opc = 0;

    while (opc < 5) {
        
    
        System.out.println("--------------------------");    
        System.out.println("| 1- Adição              |");  
        System.out.println("| 2- Subtração           |");  
        System.out.println("| 3- Multiplicação       |");  
        System.out.println("| 4- Divisão             |");  
        System.out.println("| 5- Sair                |");
        System.out.println("--------------------------");

        opc = leia.nextInt();    


        if (opc < 5) {
        
      
        System.out.println("Digite o primeiro valor: "); 
         Y = leia.nextInt(); 
        System.out.println("Digite o segunda valor: "); 
         X = leia.nextInt(); 
        }  
        
        System.out.println("");
        System.out.println("");   
            switch (opc) {
                case 1:
         
                result = X + Y;
                System.out.println("Resolução: " + Y + " + " + X + " = " + result); 
            break;
                case 2:
                
                result = Y - X;
               System.out.println("Resolução: " + Y + " - " + X + " = " + result);                 
            break;
                case 3:
                
                result = Y * X;
                 System.out.println("Resolução: " + Y + " * " + X + " = " + result);
            break;
                 case 4:
                
                result = Y / X;
                 System.out.println("Resolução: " + Y + " / " + X + " = " + result);
            break;
                case 5:
                System.out.println("Saindo.....");
                

            break;
                
            
            default:
                break;
    }
    
    
    
    
    
    
    
    
    
}      
  
leia.close();
    }
}