import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instânciando os objetos
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de volume!");
        System.out.println("Insira o valor da base: ");
        calculadora.setBase(scanner.nextFloat());
        System.out.println("Insira o valor do comprimento: ");
        calculadora.setComprimento(scanner.nextFloat());
        System.out.println("Insira o valor da altura: ");
        calculadora.setAltura(scanner.nextFloat());
        System.out.println("O volume da área é: " + calculadora.getVolume());
    }
}