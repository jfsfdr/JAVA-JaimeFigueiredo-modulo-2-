package salario;
/**
 * Autor: Jaime Figueiredo
 * Data 07/12/2017
 */
import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
    //Variaveis
    double sal, aum, stotal, aums;
    Scanner dados = new Scanner (System.in);
    //Codigo Principal
    System.out.println("Qual o seu Salario?");
    sal = dados.nextDouble();
    System.out.println("Qual a percentagem do aumento?");
    aum = dados.nextDouble();
    //Calculos
    aums = sal*(aum*0.01);
    stotal = sal+aums;
    //Finalizaçao
    System.out.print("Salario Atualizado = " + stotal);
    }
    
}
