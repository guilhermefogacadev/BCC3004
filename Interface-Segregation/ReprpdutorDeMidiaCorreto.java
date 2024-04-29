
public interface ReprodutorDeMidia {
    void iniciar();
    void pausar();
}

// Reprodutor unico para operações com séries
public interface ReprodutorDeSerie extends ReprodutorDeMidia {
    void assistirProximoEpisodio();
}

// Implementação para reprodutor de séries
public class ReprodutorDeSerieClasse implements ReprodutorDeSerie {
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

// Implementação para reprodutor de filmes
public class ReprodutorDeFilmeClasse implements ReprodutorDeMidia {
    @Override
    public void iniciar() {
        System.out.println("Iniciando reprodução de filme...");
    }

    @Override
    public void pausar() {
        System.out.println("Filme pausado.");
    }
}
