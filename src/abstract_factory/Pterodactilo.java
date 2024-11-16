package abstract_factory;

// Implementação de AnimalTransporte para a Selva Jurássica
public class Pterodactilo implements AnimalTransporte {
    @Override
    public void exibirTransporte() {
        System.out.println("Animal de Transporte: Pterodáctilo voador.");
    }
}