import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        contato1.setNome("Samuel");
        contato1.setEmail("123@outlook.com");

        contato1.setEndereco("Rua um", 123, "Centro", "Toledo", "Paraná");
        contato1.setTelefone("45 3279-0001", "Tim");


        Contato contato2 = new Contato();
        contato2.setNome("Leumas");
        contato2.setEmail("321@outlook.com");

        contato2.setEndereco("Rua um", 123, "Centro", "Toledo", "Paraná");
        contato2.setTelefone("45 3279-0001", "Tim");

        //System.out.println(contato1);


        List<Contato> agenda = new ArrayList<>();

        agenda.add(contato1);
        agenda.add(contato2);

        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i).toString());
        }
    }
}
