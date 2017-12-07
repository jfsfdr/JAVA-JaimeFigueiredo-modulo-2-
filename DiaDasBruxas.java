package diadasbruxas;
/**
 * Autor: Jaime Figueiredo
 * Data 07/12/2017
 */
import java.util.Scanner;
public class DiaDasBruxas {
    public static void main(String[] args) {
        //Variaveis
        String dt;
        Scanner dados =new Scanner(System.in);
        //Codigo Principal
        System.out.println("Doce ou Travessura? ");
        dt = dados.nextLine();
	System.out.print("o Utilizador escolheu " + dt);
        
    }
    
}
