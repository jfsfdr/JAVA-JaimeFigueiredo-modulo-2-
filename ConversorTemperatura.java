package conversor.temperatura;
/**
 * Autor: Jaime Figueiredo
 * Data 09/11/2017
 */
import java.util.Scanner;
public class ConversorTemperatura {
    public static void main(String[] args) {
    //Variáveis
    double f,c;
    Scanner temp=new Scanner(System.in);
        // Codigo Principal
        System.out.print("Indique a tempratura em Fº ");
        f=temp.nextDouble();
        c=(f-32)/1.8;
        System.out.print("A temperatura em Cº é " + c);            
    }    
}
