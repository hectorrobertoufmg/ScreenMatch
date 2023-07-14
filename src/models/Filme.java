package models;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel
{
    private String _diretor;
    public void setDiretor (String diretor)
    {
        this._diretor = diretor;
    }

    public String getDiretor()
    {
        return _diretor;
    }

    public int getClassificacao()
    {
        return (int) getMediaAvaliacoes();
    }
}
