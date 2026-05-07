import br.com.alura.screnmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screnmatch.calculos.FiltroRecomendacao;
import br.com.alura.screnmatch.modelos.Episodio;
import br.com.alura.screnmatch.modelos.Movie;
import br.com.alura.screnmatch.modelos.Serie;

import java.util.ArrayList;

public class Main{
    static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setNome("O poderoso chefão");
        myMovie.setAnoDeLancamento(1970);
        myMovie.setDuracaoEmMinutos(180);

        myMovie.showTechnicalRecord();
        myMovie.feedback(8);
        myMovie.feedback(5);
        myMovie.feedback(10);
        System.out.println("Total de Avaliações: " + myMovie.getTotalDeAvaliacaol());
        System.out.println(myMovie.pegaMedia());

        Serie myserie = new Serie();
        myserie.setNome("Invencible");
        myserie.setAnoDeLancamento(2020);
        myserie.showTechnicalRecord();
        myserie.setTemporadas(4);
        myserie.setEpisodiosPorTemporadas(8);
        myserie.setMinutosPorEpisodio(60);
        System.out.println("Duração para maratonar: " + myserie.getDuracaoEmMinutos());
        myserie.setAtiva(true);

        Movie outroFilme = new Movie();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(outroFilme);
        calculadora.inclui(myserie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filra(myMovie);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("Lost");
        episodio.setTotalVisualizacoes(300);
        filtro.filra(episodio);


        Movie filmeDois = new Movie();
        filmeDois.setNome("Michael");
        filmeDois.setDuracaoEmMinutos(180);
        filmeDois.setAnoDeLancamento(2026);
        filmeDois.feedback(10);

        Serie serieDois = new Serie();
        serieDois.setNome("Teen Wolf");
        serieDois.setAnoDeLancamento(2011);

        var series = new ArrayList<>();
        series.add(myserie);
        series.add(serieDois);

        System.out.println(series);
        System.out.println(series.get(0).toString());
        System.out.println(series.get(1).toString());

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(myMovie);
        listaDeFilmes.add(filmeDois);
        listaDeFilmes.add(outroFilme);

        System.out.println("Primeiro filme" + listaDeFilmes.get(0).getNome());
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(1).toString());

    }
}

