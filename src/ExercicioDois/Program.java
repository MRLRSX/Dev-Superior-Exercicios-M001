package ExercicioDois;

import java.util.Locale;
import java.util.Scanner;
/*
 * @author LUCAS ROCHA DOS SANTOS
 * 
 * */


public class Program {
	public static void main(String[] args) {
      
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("TRABALHANDO COM STRING .....");
		System.out.println("FORMATAR toLowerCase() toUpperCase() trim() .....");
		System.out.println("RECORTAR subString() substring(inicio, fim).....");
		System.out.println("SUBSTITUIR Replace(char, char), Replace(string, string) .....");
		System.out.println("Buscar IndexOf, LastIndexOf.....");
		System.out.println("Quebrar a String Split().....");
		
		System.out.println("INFORME UM STRING PARA EXEMPLO .......");
		
		String texto = "LUCAS ROCHA DOS SANTOS";
		
		System.out.println("VEJA O EXEMPLO " + texto);
		
		System.out.printf("\ntoLowerCase() %s toUpperCase() %s trim() %s ", texto.toLowerCase(), texto.toUpperCase(), texto.trim());
		System.out.printf("\nsubString(3) %s substring(3, 6) %s ", texto.substring(3), texto.subSequence(3, 6));
		System.out.printf("\nReplace(L, C), %s Replace(ROC, RS) %s", texto.replace('L', 'C'), texto.replace("ROC", "RS"));
		System.out.printf("\nIndexOf %d, LastIndexOf %d", texto.indexOf('N'), texto.lastIndexOf('A'));
		String[] lista = texto.split(" ");
		System.out.printf("\nSplit() EXEMPLO LUCAS ROCHA SANTOS VETOR POSICAO 1 %s  2 -  %s 3 - %s 4 - %s" , lista[0], lista[1], lista[2], lista[3]);
		
		entradaDados.close();
	}
}
