// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        String nomeFilme = "The Miracle Club";
        int ano = 2023;
        double duracaoMin = 91;

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: "+nomeFilme);
        System.out.println("O ano do filme: " + ano);
        System.out.println("Duração: "+ duracaoMin + " Minutos");

        // Utilizando o text BLocks, usa-se 3 pares de dupla aspas.
        String sinopse =
                """
                There's just one dream for the women of Ballygar 
                to taste freedom: to win a pilgrimage to the sacred French town of Lourdes.
                """;
        boolean disponivel = true;
        if (disponivel)
        {
            System.out.println(String.format("O filme %s está disponível!", nomeFilme));
        } else
        {
            System.out.println("Filme indisponível");
        }

    }
    }
