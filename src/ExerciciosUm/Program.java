package ExerciciosUm;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entradaDados = new Scanner(System.in);
      
      System.out.println("OPERADORES BITWISE");
      System.out.println("OPERADORES BIT A BIT & | ^ LEMBRE V = 1 E F = 0");
      System.out.println("INFORME PRIMEIRO NUMERO PARA COMPARAÇÃO BINARIO BIT A BIT ....");
      int numero = entradaDados.nextInt();
      System.out.println("INFORME SEGUNDO NUMERO PARA COMPARAÇÃO BINARIO BIT A BIT ....");
      int numeroDois = entradaDados.nextInt();
      System.out.printf("\nnumero tal %d & %d resultado comparação bit a bit = %d ", numero, numeroDois, numero & numeroDois);
      System.out.printf("\nnumero tal %d | %d resultado comparação bit a bit = %d ", numero, numeroDois, numero | numeroDois);
      System.out.printf("\nnumero tal %d ^ %d resultado comparação bit a bit = %d ", numero, numeroDois, numero ^ numeroDois);
      
      
      entradaDados.close();
	}
}
