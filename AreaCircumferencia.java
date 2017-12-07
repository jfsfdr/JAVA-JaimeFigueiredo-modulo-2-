package areacircumferencia;
/**
 * Autor: Jaime Figueiredo
 * Data 07/12/2017
 */
import java.util.Scanner;
public class AreaCircumferencia {    
    public static void main(String[] args) {
        //Variaveis
        double r,a;
        Scanner dados = new Scanner (System.in);
        //Código Principal
		System.out.println("Qual a medida do raio?");
                r=dados.nextDouble();
		a = 3.14*r*r;
		System.out.printf("Area da Circunferencia = " + a);
    }
}
