public interface ReprodutorDeMidia {
    void iniciar();
    void pausar();
    void assistirProximoEpisodio(); // Inadequado para filmes
}

public class ReprodutorDeSerie implements ReprodutorDeMidia {
    @Override
    public void iniciar() {
        System.out.println("Iniciando reprodução de série...");
    }

    @Override
    public void pausar() {
        System.out.println("Série pausada.");
    }

    @Override
    public void assistirProximoEpisodio() {
        System.out.println("Assistindo próximo episódio...");
    }
}

public class ReprodutorDeFilme implements ReprodutorDeMidia {
    @Override
    public void iniciar() {
        System.out.println("Iniciando reprodução de filme...");
    }

    @Override
    public void pausar() {
        System.out.println("Filme pausado.");
    }

    @Override
    public void assistirProximoEpisodio() {
        // Não faz sentido para filmes, mas é obrigatório implementar
        System.out.println("Não aplicável a filmes.");
    }
}