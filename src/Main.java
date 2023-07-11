import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem Vindo ao jogo de adivinhação!");
        System.out.println("Advinhe a fruta!");
        boolean naoAcertou = true;
        String nomeFruta = "Banana";
        String palpite;
        while (naoAcertou)
        {
            System.out.println("Digite o nome da fruta: ");
            palpite = leitura.nextLine();
            if (palpite.equals(nomeFruta))
            {
                System.out.println("Parabens você acertou!");
                naoAcertou = false;
            }else
            {
                System.out.println("Errou! Tente novamente!");
            }

        }

    }
    }
