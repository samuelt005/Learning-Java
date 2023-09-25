public class Telefone {
    private String numero;
    private String operadora;

    public Telefone(String numero, String operadora) {
        this.numero = numero;
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return "Telefone:" + '\n' +
                "Número: " + numero + '\n' +
                "Operadora: " + operadora;
    }
}
