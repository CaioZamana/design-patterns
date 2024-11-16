package singleton;

public class Main {
    // Método main para testar a classe Singleton
    public static void main(String[] args) {
        // Obtém a única instância do Singleton
        SuperPadraoSingleton singleton = SuperPadraoSingleton.getInstance();

        // Chama um método da instância para mostrar que foi acessada
        singleton.exibirMensagem();

        // Verifica se duas chamadas para getInstance() retornam a mesma instância
        SuperPadraoSingleton outroSingleton = SuperPadraoSingleton.getInstance();
        System.out.println("As duas instâncias são iguais? " + (singleton == outroSingleton));
    }
}
