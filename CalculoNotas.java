/**
 * Jaime Figueiredo
 * 23/11/2017
 */
package calculo.notas;
import java.util.Scanner;
public class CalculoNotas {
    public static void main(String[] args) {
    //Variaveis
    int nc,na;
    double nf;
    String nome,ap;
    Scanner notas =new Scanner(System.in);
    Scanner nomes =new Scanner (System.in);
    //Código principal
    
    System.out.print("Qual é a nota do dominio cognitivo ? ");
    nc=notas.nextInt();
    
    System.out.print("Qual é a nota das atitudes ? ");
    na=notas.nextInt();
    
    System.out.print("Qual é o nome do aluno ? ");
    nome=nomes.next();
  
    //Calculos
    
    nf =(nc*0.6 + na*0.4);
  
    //Se 
    if (nf<10)
        ap="reprovado(a)";
        else
        ap="aprovado(a)";
                

               
    //Finalização
    
    System.out.print("A nota do(a) "  + nome + " é " + nf + " e este está " + ap);
    
    
    
    
    
    }
    
}