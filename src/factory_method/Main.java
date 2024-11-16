package factory_method;

public class Main {
    public static void main(String[] args) {
        // Criando o cenário de Deserto usando a fábrica
        CenarioFactory desertoFactory = new DesertoFactory();
        desertoFactory.iniciarCenario();

        // Criando o cenário de Selva Jurássica usando a fábrica
        CenarioFactory selvaFactory = new SelvaJurasicaFactory();
        selvaFactory.iniciarCenario();
    }
}
