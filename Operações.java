/**
 * Jaime Figueiredo
 * 23/11/2017
 */
package operações;
import java.util.Scanner;
public class Operações {
    public static void main(String[] args) {
    //Variaveis
    String operacao;
    double op1,op2,r = 0;
    Scanner operacoes=new Scanner(System.in);
    Scanner operadores=new Scanner(System.in);
    
    //Codigo Principal
    System.out.print("Escolha uma operação das seguintes: + - * / . ");
    operacao=operacoes.next();
    
    System.out.print("Qual é o primeiro operador ?");
    op1=operadores.nextDouble();
    
    System.out.print("Qual é o segundo operador ?");
    op2=operadores.nextDouble();
    
    //Caso
    
    switch(operacao) {
        case "+": r = (op1 + op2);
            break;
        case "-": r = (op1 - op2);
            break;
        case "*": r = (op1 * op2);
            break;
        case "/": r = (op1 / op2);
            break;
    }
    //Finalização
    
    System.out.print("O resultado é " + r );
    
        
    }
    }
    

