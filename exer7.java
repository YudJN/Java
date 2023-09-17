import java.math.BigInteger;

public class exer7 {
    public static void main(String[] args) {
        BigInteger somatotal = BigInteger.valueOf(1);
        for (int i = 1; i <= 64; i++) {
           
            somatotal=somatotal.multiply(BigInteger.valueOf(2));
           
        }  
    
        System.out.println("--------------------------");
        System.out.println("Resultado: "+ somatotal);
    
    }
}
