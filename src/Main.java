import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        // Definindo variáveis!
        Scanner leitura = new Scanner(System.in);
        Random numero = new Random();
        boolean naoAcertou = true;
        int  palpite;
        int giftNumber = numero.nextInt(100), tentativas = 5;

        System.out.println("Bem Vindo ao jogo de adivinhação!");
        System.out.println("Advinhe o Número!!");


        while (naoAcertou)
        {
            System.out.println("Digite o numero: ");
            palpite = leitura.nextInt();
            if (giftNumber == palpite)
            {
                System.out.println("Parabens você acertou!");
                naoAcertou = false;
            }else
            {
                tentativas--;
                if (tentativas == 0)
                {
                    System.out.println("Você perdeu! Utilizou tdas as 5 tentativas!");
                    break;
                }else
                {
                    System.out.println("Errou, tente novamente! Você tem "+ tentativas +" Tentativas");
                }
            }

        }

    }
    }
