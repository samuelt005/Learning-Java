public class Producao {
    static int previsaoDemanda = 200;
    static int producaoNormal = 250;
    static int estoqueInicial = 50;
    static int estoqueFinal;

    public static void main(String[] args) {
        estoqueFinal = (estoqueInicial + producaoNormal) - previsaoDemanda;
        System.out.println("O estoque final previsto para o mês é de: " + estoqueFinal + " Unidades");
    }
}