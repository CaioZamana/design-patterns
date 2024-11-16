package bridge;

// Implementação do Avatar
interface Avatar {
    void exibirAvatar();
}

// Implementação concreta do Avatar Feminino
class AvatarFeminino implements Avatar {
    @Override
    public void exibirAvatar() {
        System.out.println("Exibindo avatar feminino do personagem.");
    }
}

// Classe concreta PersonagemPrincipal
class PersonagemPrincipal extends PadraoBridgePersonagem {
    public PersonagemPrincipal(Avatar avatar) {
        super(avatar);
    }

    public void realizarAcao() {
        System.out.println("Personagem principal realizando uma ação.");
    }
}