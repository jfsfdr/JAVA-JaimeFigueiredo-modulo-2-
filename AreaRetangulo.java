package area.retangulo;
/**
 * Autor: Jaime Figueiredo
 * Data 09/11/2017
 */
import java.util.Scanner;
public class AreaRetangulo {
    public static void main(String[] args) {
        //Variáveis
        double c,l,a;
        Scanner dados =new Scanner(System.in);
        // Codigo Principal
        System.out.print("Qual é o comprimento ? ");
        c=dados.nextDouble();
        
        System.out.print("Qual é a largura ? ");
        l=dados.nextDouble();
        
        a=c*l;
        System.out.print("A área é " + a);
    }
    
}
