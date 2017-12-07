package perimetrodacircumferencia;
/**
 * Autor: Jaime Figueiredo
 * Data 07/12/2017
 */
import java.util.Scanner;
public class PerimetroDaCircumferencia {
    public static void main(String[] args) {
    //Variaveis
    double d,p;
    Scanner dados = new Scanner (System.in);
    //Codigo Principal
    System.out.println("Qual o diametro?");
    d = dados.nextDouble();
    //Calculos
    p = 3.14*d;
    //Finalizaçao
    System.out.printf("Perimetro = " + p);
		
    }
    
}
