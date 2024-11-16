package factory_method;

public class DesertoFactory extends CenarioFactory {
    @Override
    public Cenario criarCenario() {
        return new Deserto();
    }
}