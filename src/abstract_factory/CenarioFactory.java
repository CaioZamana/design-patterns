package abstract_factory;

// Interface que define a criação dos animais para um cenário
public interface CenarioFactory {
    AnimalPerigoso criarAnimalPerigoso();
    AnimalTransporte criarAnimalTransporte();
}
