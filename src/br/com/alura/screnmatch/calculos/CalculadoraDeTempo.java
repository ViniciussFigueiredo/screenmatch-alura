package br.com.alura.screnmatch.calculos;
import br.com.alura.screnmatch.modelos.Title;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Title t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }


}
