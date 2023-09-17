import java.util.Scanner;

public class exer2 {
    
public static void main(String[] args) {
 
    int opção = 2;
    Scanner leia = new Scanner (System.in);
    
    while (opção != 0 && opção != 1) {
    
        System.out.println("------------- Escolha umas das opção -------------");        
        System.out.println("0 = MENGO ");
        System.out.println("1 = FLAMENGO ");
         opção = leia.nextInt(); 
        
        switch (opção) {
            case 0:
            System.out.println("VÇ é flamenguista Raiz");
                break;
        
            case 1:
               System.out.println("VÇ é um pessoa de respeito");
                break;    
            
            
            default:
                System.out.println("Erro é 0 ou 1 é cego");
            
                break;
        }

    }  



leia.close();
}



}
