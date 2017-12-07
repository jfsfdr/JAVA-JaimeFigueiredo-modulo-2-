package leia;
/**
 * Autor: Jaime Figueiredo
 * Data 07/12/2017
 */
import java.io.*;
public class Leia {
    public static void main(String[] args) throws IOException{
    //Variaveis
    String C;
    //Codigo Principal
       		System.out.print("Nome\n");
		InputStreamReader LerS = new InputStreamReader (System.in);
		BufferedReader GuardaS = new BufferedReader (LerS);
		C = GuardaS.readLine();
		System.out.print(C);	
    }
    
}
