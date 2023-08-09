public class Aluno {
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;
    private final int matricula;

    public void imprimeFicha() {
        System.out.println("Nome: " + this.nome);
        endereco.imprimeEndereco();
        System.out.println("Telefone: " + this.telefone);
        System.out.println("E-mail: " + email);
        System.out.println("Nº de matrícula: " + matricula);
    }

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }
}
