import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limit = scanner.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;
        while(exit != 0) {
            System.out.println("Digite a descrição da compra:");
            String description = scanner.next();

            System.out.println("Digite o valor da compra:");
            double value = scanner.nextDouble();

            Purchase purchase = new Purchase(description, value);
            boolean purchaseMade = card.addPurchase(purchase);

            if (purchaseMade) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                exit = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                exit = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(card.getPurchases());
        for (Purchase c : card.getPurchases()) {
            System.out.println(c.getDescription() + " - " +c.getValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +card.getBalance());
    }


}