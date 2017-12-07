package maiornumero.igual;
/**
 * Autor: Jaime Figueiredo
 * Data 07/12/2017
 */
import java.util.Scanner;
public class MaiorNumeroIgual {
    public static void main(String[] args) {
    //Variaveis
    double n1, n2;
    Scanner dados = new Scanner(System.in);
    //Codigo Principal
    System.out.println("Qual o primeiro numero?");
    n1 = dados.nextDouble();
    System.out.println("Qual o segundo numero?");
    n2 = dados.nextDouble();
    //Se
    if (n1 > n2) 
	System.out.print("Maior Numero = " + n1);
		else if (n2 > n1) 
			System.out.print("Maior Numero = " + n2);
                            else
                                System.out.print("Os numeros são iguais!");	
    }
    
}
