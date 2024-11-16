package factory_method;

public class SelvaJurasicaFactory extends CenarioFactory {
    @Override
    public Cenario criarCenario() {
        return new SelvaJurasica();
    }
}