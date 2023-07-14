// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import calculos.*;
import models.*;

public class Main {
    public static void main(String[] args)
    {
        Serie minhaSerie = new Serie();
        minhaSerie.setAtiva(true);
        minhaSerie.setNome("The Witcher");
        minhaSerie.setTotalDeVisualizacoes(400);
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(minhaSerie);
    }
    }
