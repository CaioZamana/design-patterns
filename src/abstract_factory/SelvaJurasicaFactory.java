package abstract_factory;

// Fábrica para criar os animais da Selva Jurássica
public class SelvaJurasicaFactory implements CenarioFactory {
    @Override
    public AnimalPerigoso criarAnimalPerigoso() {
        return new TRex();
    }

    @Override
    public AnimalTransporte criarAnimalTransporte() {
        return new Pterodactilo();
    }
}