/*
Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
 */
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= 1;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
