import java.util.Scanner;

public class Leitura {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o ano do filme: ");
        int anoFilme = leitura.nextInt();
        // Coloquei a linha abaixo, pois o primeiro nextInt() deixa sobrando um /n que é pego pelo proximo.
        leitura.nextLine();
        System.out.println("Digite o nome do filme: ");
        String nomeFIlme = leitura.nextLine();

        System.out.println(String.format("O filme %s foi feito em %d", nomeFIlme, anoFilme ));

    }
}
