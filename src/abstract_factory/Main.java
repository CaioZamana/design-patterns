package abstract_factory;

public class Main {
    public static void main(String[] args) {
        // Usando a fábrica do Deserto
        CenarioFactory desertoFactory = new DesertoFactory();
        AnimalPerigoso serpente = desertoFactory.criarAnimalPerigoso();
        AnimalTransporte dromedario = desertoFactory.criarAnimalTransporte();

        serpente.exibirPerigo();
        dromedario.exibirTransporte();

        // Usando a fábrica da Selva Jurássica
        CenarioFactory selvaFactory = new SelvaJurasicaFactory();
        AnimalPerigoso tRex = selvaFactory.criarAnimalPerigoso();
        AnimalTransporte pterodactilo = selvaFactory.criarAnimalTransporte();

        tRex.exibirPerigo();
        pterodactilo.exibirTransporte();
    }
}
