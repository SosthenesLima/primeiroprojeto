/*
Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
Considere que o valor de 1 dólar é equivalente a 4.94 reais.
Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
 */
public class Dolares {
    public static void main(String[] args) {
        double valorEmDolares = 5.0;
        double taxaDeConversao = 4.94;

        double valorEmReais = (valorEmDolares * taxaDeConversao);

        System.out.println("O valor em reais é: " + valorEmReais);

    }
}
