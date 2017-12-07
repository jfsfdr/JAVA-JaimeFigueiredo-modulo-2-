package volumeparalelepipedo;
/**
 * Autor: Jaime Figueiredo
 * Data 07/12/2017
 */
import java.util.Scanner;
public class VolumeParalelepipedo {
    public static void main(String[] args) {
        //Variaveis
	double c,l,h,v;
        Scanner dados = new Scanner (System.in);
        //Codigo Principal
	System.out.println("Qual o comprimento?");
	c = dados.nextDouble();
	System.out.println("Qual a altura?");
	h = dados.nextDouble();
	System.out.println("Qual a largura?");
	l = dados.nextDouble();
        //Calculos
	v = c*l*h;
        //Finalizaçao
	System.out.printf("Volume do Paralelipipedo = " + v);
    }
    
}
