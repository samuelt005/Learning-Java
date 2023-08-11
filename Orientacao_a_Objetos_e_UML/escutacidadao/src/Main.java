public class Main {
    public static void main(String[] args) {
        Cidadao cidadao1 = new Cidadao();
        Endereco endereco1 = new Endereco("Centro","rua 1", 85940000, 123);
        cidadao1.setNome("Samuel");
        cidadao1.setNumeroCpf("333.333.333-01");
        cidadao1.setNumeroIptu("123456");
        cidadao1.setEndereco(endereco1);

        Reparo reparo1 = new Reparo();
        Endereco endereco2 = new Endereco("Centro","rua 6", 85940000, 0);
        reparo1.setLocalizacaoNaRua("Meio");
        reparo1.setDistrito("Distrito 1");
        reparo1.setId(1);
        reparo1.setEndereco(endereco2);

        System.out.println(reparo1.getDistrito());
    }
}