package factory_method;

public abstract class CenarioFactory {
    // Factory Method
    public abstract Cenario criarCenario();

    // Método comum para iniciar o cenário
    public void iniciarCenario() {
        Cenario cenario = criarCenario();
        cenario.exibirDetalhes();
    }
}