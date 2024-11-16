package abstract_factory;

// Implementação de AnimalPerigoso para o Deserto
public class Serpente implements AnimalPerigoso {
    @Override
    public void exibirPerigo() {
        System.out.println("Animal Perigoso: Serpente venenosa do deserto.");
    }
}