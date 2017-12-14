package fatorial;
/**
 * Jaime Figueiredo
 * 14/12/2017
 */
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        //Variaveis
        int  n, fat=1;
        Scanner dados=new Scanner(System.in);
        //Código Principal
        System.out.print("Qual numero quer fatorizar ?");
        n=dados.nextInt();
        for(int m=n ; m>=1 ; m--)
        fat*=m;//fat=fat*m
        System.out.print("O fatorial é " + fat);
    }
    
}
