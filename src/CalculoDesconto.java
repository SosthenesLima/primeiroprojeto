public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOrigial = 50.00;

        double percentualDesconto = 10;
        double valorDeDesconto = (percentualDesconto / 100.0) * precoOrigial;
        double novoPreco = precoOrigial -  valorDeDesconto;

        System.out.println("Preço origial: R$ " + precoOrigial);
        System.out.println("Desconto: R$ " + valorDeDesconto);
        System.out.println("Novo Preço com desconto: R$ " + novoPreco);


    }
}
