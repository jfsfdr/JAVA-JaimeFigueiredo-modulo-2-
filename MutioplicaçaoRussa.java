package mutioplicaçaorussa;
import java.util.Scanner;
public class MutioplicaçaoRussa {
    public static void main(String[] args) {
//Variaveis
        int M , m , m1 , M1 , r=0 ;
        Scanner dados=new Scanner(System.in);
//Código Principal
        System.out.print("Qual é o multiplicando ? ");
        m=dados.nextInt();
        System.out.print("Qual é o multiplicador ? ");
        M=dados.nextInt();
//Mostrar Leitura
        //System.out.print("O multiplicando é " + m + "\m");
        //System.out.print("O multiplicador é " + M + "\M");
//While
    m1=m;
    M1=M;
         System.out.print(m + "\t"); 
         System.out.print(M + "\n");         
        while (m1>1){
            if (m1%2!=0)
            
            m1=m1/2;
            System.out.print(m1 + "\t"); 
            M1=M1*2;
            System.out.print(M1 + "\n");
             System.out.print(M1 + "\n");
             r=r+M1;
            System.out.print(r + "\n");
        
        }
        //if(M%2!=0){
        // r=r+M; 
        // }
     System.out.print("O resultado é " + r);  
    }

}
