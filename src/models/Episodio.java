package models;

import calculos.Classificavel;

public class Episodio implements Classificavel
{
    private int numeroDoEpisodio;
    private String nomeDoEpisodio;
    private Serie serie;

    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    private int totalDeVisualizacoes;

    public int getClassificacao()
    {
        if(totalDeVisualizacoes > 100)
        {
            return 4;
        }else
        {
            return 2;
        }
    }
    public int getNumeroDoEpisodio() {
        return numeroDoEpisodio;
    }

    public void setNumeroDoEpisodio(int numeroDoEpisodio) {
        this.numeroDoEpisodio = numeroDoEpisodio;
    }

    public String getNomeDoEpisodio() {
        return nomeDoEpisodio;
    }

    public void setNomeDoEpisodio(String nomeDoEpisodio) {
        this.nomeDoEpisodio = nomeDoEpisodio;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }


}
