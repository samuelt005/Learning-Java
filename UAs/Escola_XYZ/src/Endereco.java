public class Endereco {
    private String rua;
    private String bairro;
    private int numero;

    public void imprimeEndereco() {
        System.out.println("Rua: " + rua);
        System.out.println("Bairro: " + bairro);
        System.out.println("Número: " + numero);
    }

    public Endereco(String rua, String bairro, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
}
