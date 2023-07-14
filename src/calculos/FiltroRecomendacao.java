package calculos;

public class FiltroRecomendacao
{
    public void filtrar(Classificavel classificavel)
    {
        if (classificavel.getClassificacao() >= 4)
        {
           System.out.println("Está entre as preferidas!");
        }else if (classificavel.getClassificacao() >=2 )
        {
            System.out.println("Muito bem avaliada!");
        }else
        {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
