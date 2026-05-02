public class Movie {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    int duracaoEmMinutos;

    int getTotalDeAvaliacaol() {
        return  totalDeAvaliacao;
    }

    void showTechnicalRecord () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void feedback(double note) {
        somaDasAvaliacoes += note;
        totalDeAvaliacao++;
    }

    double pegaMedia () {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }

}
