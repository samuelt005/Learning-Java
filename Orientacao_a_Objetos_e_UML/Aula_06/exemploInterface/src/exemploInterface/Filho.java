// Em java para resolvermos o problema da herança múltipla utilizamos o tipo de referência "interface". A interface
// representa de certa maneira um "contrato" entre a interface e a classe que a implementa. Por exemplo:
// Digamos que tenhamos uma classe chamada "Pai" e outra chamada "Mae" e precisamos herdar tudo que há nelas em uma
// classe chamada "Filho". Considerando que não será necessário instanciar as classes "Pai" e "Mae" podemos
// transformá-las em interfaces, deste modo vamos obrigar a classe "Filho" a implementar tudo que está definido nas duas
// interfaces.
package exemploInterface;

public class Filho implements Mae, Pai {
    @Override // Faz o override do método obrigado pela interface Mae
    public void caracteristicasDaMae() {
        System.out.println("Cabelos de cor: preta");
        System.out.println("Altura: mediana");
    }

    @Override // Faz o override do método obrigado pela interface Pai
    public void caracteristicasDoPai() {
        System.out.println("Olhos de cor: marrom");
        System.out.println("Cor da pele: clara");
    }

    // Após isso a chamada dos métodos podem ser feito normalmente
}
