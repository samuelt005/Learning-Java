public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1);
        Endereco endereco1 = new Endereco("Bandeirantes", "Centro", 321);
        aluno1.setNome("Samuel");
        aluno1.setEndereco(endereco1);
        aluno1.setTelefone("45 1234-4321");
        aluno1.setEmail("samuel@hotmail.com");

        aluno1.imprimeFicha();
    }
}