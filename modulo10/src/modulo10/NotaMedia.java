package modulo10;
import java.util.Scanner;
public class NotaMedia {
		  public static void main(String[] args) {
		        int nota1;
		        int nota2;
		        int nota3;
		        int nota4;
		        
		        Scanner texto = new Scanner(System.in);
		        System.out.println("escreva a nota 1:");
		        nota1 =texto.nextInt();
		        System.out.println("escreva a nota 2:");
		        nota2 =texto.nextInt();
		        System.out.println("escreva a nota 3:");
		        nota3 =texto.nextInt();
		        System.out.println("escreva a nota 4:");
		        nota4 =texto.nextInt();
		        
		        float media = (nota1+nota2+nota3+nota4)/4;
		        System.out.println("sua média é: " + media);
		        if(media >= 7) {
		        	System.out.println("você foi aprovado !");
		        }else if(media >= 5) {
		        	 System.out.println("você está de recuperação!");
		        }else if(media < 5) {
		        	 System.out.println("você foi reprovado!");
		        }
		       

		    }

}
