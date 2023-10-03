/*7 - Faça um programa que receba a idade de 15 pessoas e que calcule e mostre:
a) A quantidade de pessoas em cada faixa etária;
b) A percentagem de pessoas na primeira e na última faixa etária, com relação ao total de pessoas:
Até 15 anos
De 16 a 30 anos
De 31 a 45 anos
De 46 a 60 anos
Acima de 61 anos */

import java.lang.Math;

public class exer7 {
    
public static void main(String[] args) {
    
int ate15anos = 0,de16ate30 = 0, de31ate45 = 0, de46ate60 = 0,acimade60 = 0, idade = 0;

 for (int i = 1; i < 16;  i++) {
    

    idade = (int)(Math.random() * 100 );    

    if (idade <= 15) {
    
    ate15anos++;

    }else if (idade <= 30 && idade > 15 ){

    de16ate30++;

    }else if (idade <= 45 && idade > 30 ){
    de31ate45++;

    }else if (idade <= 60 && idade > 45 ){
    de46ate60++;

    }else {
    
    acimade60++;
    }
 }
        System.out.println("Existe " + ate15anos + " com a idade menor que 15 anos");
        System.out.println("Existe " + de16ate30 + " com a idade maior que 15 anos e menor 31");
        System.out.println("Existe " + de31ate45 + " com a idade maior que 30 anos e menor 46");
        System.out.println("Existe " + de46ate60 + " com a idade maior que 45 anos e menor 61");
        System.out.println("Existe " + acimade60 + " maior que 60");


    double porcent1 = ((double)ate15anos / 15.0) * 100; 
    double porcent2 = ((double)acimade60 / 15.0) * 100;
System.out.println("---------------------------------------------------------");
System.out.println("porcentagem da primeira faixa etaria" + porcent1);
System.out.println("porcentagem da primeira faixa etaria" + porcent2);


}
}
