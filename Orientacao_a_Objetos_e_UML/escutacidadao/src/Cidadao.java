public class Cidadao {
    //Atributos
    private String nome;
    private String numeroCpf;
    private String numeroIptu;
    private Endereco endereco;

    //Métodos Getter
    public String getNome() {
        return nome;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public String getNumeroIptu() {
        return numeroIptu;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    //Métodos Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public void setNumeroIptu(String numeroIptu) {
        this.numeroIptu = numeroIptu;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
