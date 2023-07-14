package calculos;
import models.Titulo;
import models.Filme;
import models.Serie;
public class CalculadoraDeTempo
{
    private int _tempTotal;

    public int getTempTotal() {
        return _tempTotal;
    }

    // Coloquei Tìtulo, pois assim receberá qualquer derivado da classe Título!
    public void setTempTotal(Titulo titulo) {
        this._tempTotal = titulo.get_duracaoEmMinutos();
    }



}
