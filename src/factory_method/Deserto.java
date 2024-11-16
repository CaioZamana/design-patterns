package factory_method;

// Classe concreta Deserto
public class Deserto extends Cenario {
    @Override
    public void exibirDetalhes() {
        System.out.println("Cenário: Deserto com dunas e clima árido.");
    }
}