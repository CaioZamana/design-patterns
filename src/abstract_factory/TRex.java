package abstract_factory;

// Implementação de AnimalPerigoso para a Selva Jurássica
public class TRex implements AnimalPerigoso {
    @Override
    public void exibirPerigo() {
        System.out.println("Animal Perigoso: Tiranossauro Rex gigante e feroz.");
    }
}
