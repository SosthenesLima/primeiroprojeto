/*
Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
  A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do
  que o número gerado.

  Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.

 */
import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroGerado =  new Random().nextInt(100);// gera um número aleatório entre 0 e 100
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um númnero entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; //interrope o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado);
        }
    }
}
