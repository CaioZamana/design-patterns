package factory_method;

// Classe concreta SelvaJurasica
public class SelvaJurasica extends Cenario {
    @Override
    public void exibirDetalhes() {
        System.out.println("Cenário: Selva Jurássica com vegetação densa e dinossauros.");
    }
}