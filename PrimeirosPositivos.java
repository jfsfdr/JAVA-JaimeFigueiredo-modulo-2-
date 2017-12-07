package primeirospositivos;
/**
 * Autor: Jaime Figueiredo
 * Data 07/12/2017
 */
import java.util.Scanner;
public class PrimeirosPositivos {
    public static void main(String[] args) {
        //Variaveis
        Scanner dados = new Scanner (System.in);
        int n1=1, i, n2;
	//Codigo Principal	
	System.out.print("Numero:");
	n2 = dados.nextInt();
        //For
	for ( i=2; i<=n2; i++)
	n1=n1+i;
        //Finalizacao
	System.out.print("O resultado dos primeiros positivos de "+n2+" é: " + n1);
			
    }
    
}
