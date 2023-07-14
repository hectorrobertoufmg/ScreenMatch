package models;

public class Titulo
{
    private String _nome;
    private int _anoDeLancamento;
    private boolean _incluidoNoPlano;
    private double _somaDasAvaliacoes;
    private int _totalDeAvaliacoes;
    private int _duracaoEmMinutos;

    public int get_duracaoEmMinutos() {
        return _duracaoEmMinutos;
    }

    public void set_duracaoEmMinutos(int duracaoEmMinutos) {
        this._duracaoEmMinutos = duracaoEmMinutos;
    }



    public void  setNome(String nome)
    {
        this._nome = nome;
    }

    public String getNome()
    {
        return _nome;
    }

    public void setAnoDeLancamento (int anoDeLancamento)
    {
        this._anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDelancamento()
    {
        return _anoDeLancamento;
    }

    public void set_incluidoNoPlano(boolean incluidoNoPlano) {
        this._incluidoNoPlano = incluidoNoPlano;
    }

    public boolean getIncluidoNoPlano()
    {
        return _incluidoNoPlano;
    }

    public void avaliar(double avaliacao)
    {
        this._somaDasAvaliacoes += avaliacao;
        this._totalDeAvaliacoes++;
    }

    public double getMediaAvaliacoes()
    {
        return (_somaDasAvaliacoes / _totalDeAvaliacoes);
    }


}
