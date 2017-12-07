package media;
/**
 * Autor: Jaime Figueiredo
 * Data 07/12/2017
 */
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
    //Variaveis
    double n1,n2,n3,m;
    Scanner dados = new Scanner (System.in);
    //Codigo Principal
    System.out.println("Qual a nota 1?");
    n1 = dados.nextDouble();
    System.out.println("Qual a nota 2?");
    n2 = dados.nextDouble();
    System.out.println("Qual a nota 3?");
    n3 = dados.nextDouble();
    //Calculos
    m = (n1+n2+n3)/3;
    //Finalizaçao
    System.out.printf("Média = " + m);
    }
    
}
