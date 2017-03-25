package Atividade01;
import java.util.Scanner;

/**
 *
 * @author caio.faraujo
 */
public class Fatorial {    
    
    int valor;
    
   public Fatorial () {
       Scanner input = new Scanner(System.in);
       System.out.print("Digite um valor: ");
       this.valor = input.nextInt();
   }
   

   public int calcularFatorial(int valor) {
       int fat = 1;
       for (int i = 1; i <= valor; i++) {
            fat = fat * i;      
            System.out.println("!" + valor + " = " + fat);
       }
       
       return fat;
   }
   
   public void proximoValor() {
       
   }
   
   public int valorAtual() {
       return this.valor;
   }   

}
