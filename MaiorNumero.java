package maiornumero;
/**
 * Autor: Jaime Figueiredo
 * Data 07/12/2017
 */
import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        //Variaveis
        double n1, n2,maior;
    	Scanner dados = new Scanner(System.in);
        //Codigo Principal
		System.out.println("Qual o primeiro numero?");
		n1 = dados.nextDouble();
		System.out.println("Qual o segundo numero?");
		n2 = dados.nextDouble();
                //Se
		if (n1 > n2) 
			maior = n1;
		else
			maior= n2;
                //Finalizaçao
		System.out.print("Maior Numero = " + maior);
    }
    
}
