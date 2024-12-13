/*
* Autor: Murilo Alessandro da Silva Moura
* Linguagem: Java
* Data: 11/12/2024
* Descrição: Uma calculadora para contas básicas em java
* Funcionalidades: Contas de adição, subtração, multiplicação, divisão, porcentagem e potenciação.
* Versão: Java
*/
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    
Scanner scanner = new Scanner(System.in);
     
/* Cria 3 variáveis, duas double e uma char */
      
      double A = 0, B = 0;
      String conta;
      
      System.out.println("Digite o calculo que deseja fazer: (+, -, x, :, %)\n");
      
      conta = scanner.nextLine();

System.out.printf("Digite o primeiro número desejado para fazer a conta\n");
      
      A = scanner.nextDouble();

System.out.printf("Digite o segundo número desejado para fazer a conta\n");
      
        B = scanner.nextDouble();
      
         if (conta.equals("+")) {
           System.out.printf("%.2f\n", A + B);
         }
      else if (conta.equals("-")){
           System.out.printf("%.2f\n", A - B);
      }
else if (conta.equals("x")) {
           System.out.printf("%.2f\n", A * B);
}
      else if (conta.equals(":")) {
        System.out.printf("%.2f\n", A / B);
      }
      else if (conta.equals("%")) {
        System.out.printf("%.2f\n", (B / 100) * A);

      }
      else {
        System.out.printf("Operação Invalida");
      }

      
      scanner.close();
      }
  
  

    
}
