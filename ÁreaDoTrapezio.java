package área.pkgdo.trapezio;
/**
 * Autor: Jaime Figueiredo
 * Data 09/11/2017
 */
import java.util.Scanner;
public class ÁreaDoTrapezio {
 public static void main(String[] args) {
        //Variáveis
        double bm,bM,h,a;
        Scanner dados =new Scanner(System.in);
        // TODO code application logic here
        System.out.print("Qual é a base menor ? ");
        bm=dados.nextDouble();
        
        System.out.print("Qual é a base maior ? ");
        bM=dados.nextDouble();
        
        System.out.print("Qual é a altura ? ");
        h=dados.nextDouble();
        
        a=((bm+bM)/2)*h;
        System.out.print("A área é " + a);
 }
}
