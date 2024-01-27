import java.util.function.LongUnaryOperator;

/*
27/01/2024 - Palmas-TO
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLacamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLacamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;


        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
            Filme Top Gun
            Filme de aventura com galã dos anos 80"
            Muito bom!
            Ano de lançamento
            """ + anoDeLacamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}