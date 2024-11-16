package singleton;

public class SuperPadraoSingleton {

    // Instância única da classe (Singleton)
    private static SuperPadraoSingleton instance;

    // Construtor privado impede a criação de múltiplas instâncias
    private SuperPadraoSingleton() {
        // Inicializar atributos, se necessário
    }

    // Método público que retorna a única instância da classe
    public static synchronized SuperPadraoSingleton getInstance() {
        if (instance == null) {
            instance = new SuperPadraoSingleton();
        }
        return instance;
    }
    // Método de exemplo para demonstrar o uso do Singleton
    public void exibirMensagem() {
        System.out.println("Instância única do Singleton acessada!");
    }


}
