package models;

import calculos.Classificavel;

public class Serie extends Titulo implements Classificavel
{

    private int _temporadas;
    private boolean _ativa;
    private int _episodiosPorTemporada;
    private int _minutosPorEpisodio;
    private int _numeroTotalDeVisualizacao;

    public int getTotalDeVisualizacoes() {
        return _numeroTotalDeVisualizacao;
    }

    public int getClassificacao()
    {
        if(_numeroTotalDeVisualizacao > 100)
        {
            return 4;
        }else
        {
            return 2;
        }
    }
    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this._numeroTotalDeVisualizacao = totalDeVisualizacoes;
    }
    public int getTemporadas() {
        return _temporadas;
    }

    public void setTemporadas(int temporadas) {
        this._temporadas = temporadas;
    }

    public boolean isAtiva() {
        return _ativa;
    }

    public void setAtiva(boolean ativa) {
        this._ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return _episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this._episodiosPorTemporada = episodiosPorTemporada;
    }


    public int getMinutosPorEpisodio() {
        return _minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this._minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int get_duracaoEmMinutos() {
        return getMinutosPorEpisodio()*getEpisodiosPorTemporada()*getTemporadas();
    }




}
