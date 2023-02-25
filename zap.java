import java.util.Scanner;
public class zap {
	public static void main(String args[]) {
		String numero,nome,texto;
		Scanner input= new Scanner(System.in);
		System.out.println("Qual o número do cliente");
		numero = input.nextLine();
		System.out.println("Qual o nome do cliente?");
		nome = input.nextLine();
		System.out.println("Qual o texto a ser enviado?");
		texto = input.nextLine();
		System.out.printf("https://wa.me/55%s?text=Olá %s %s",numero,nome,texto);
		
		
		
	}

}
