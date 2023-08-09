import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchCep searchCep = new SearchCep();

        System.out.println("Digite um número de CEP para consulta:");
        var cep = scanner.nextLine();

        try {
            Address address = searchCep.searchAddress(cep);
            System.out.println(address);

            FileGenerator generator = new FileGenerator();
            generator.saveJson(address);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}