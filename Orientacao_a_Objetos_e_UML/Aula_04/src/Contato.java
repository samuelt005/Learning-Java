public class Contato {
    private String  nome;
    private String email;
    private Telefone telefone;
    private Endereco endereco;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String numero, String operadora) {
        this.telefone = new Telefone(numero, operadora);
    }

    public void setEndereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.endereco = new Endereco(rua, numero, bairro, cidade, estado);
    }

    @Override
    public String toString() {
        return "Dados do contato: " + '\n' +
                "Nome: " + nome + '\n' +
                "E-mail: " + email + '\n' + '\n' +
                telefone.toString() + '\n' + '\n' +
                endereco.toString();
    }
}
