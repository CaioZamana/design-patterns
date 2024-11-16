package abstract_factory;

// Implementação de AnimalTransporte para o Deserto
public class Dromedario implements AnimalTransporte {
    @Override
    public void exibirTransporte() {
        System.out.println("Animal de Transporte: Dromedário resistente do deserto.");
    }
}