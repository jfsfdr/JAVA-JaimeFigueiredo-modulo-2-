package teorema.pitagoras;
//Autor: Jaime Figueiredo
//Data: 09/11/2017
import java.util.Scanner;
public class TeoremaPitagoras {
    public static void main(String[] args) {
     //Variaveis
     double c1,c2,h;
     Scanner dados=new Scanner(System.in);
    //Código Principal 
     System.out.print("C1");
     c1=dados.nextDouble();
     
     System.out.print("C2");
     c2=dados.nextDouble();
     
     h=Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
     System.out.print("Hipotnusa" + h);              
  }
     
}
    

