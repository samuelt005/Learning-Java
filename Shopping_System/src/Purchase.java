public class Purchase implements Comparable<Purchase> {
    private String description;
    private double value;

    public Purchase(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Descrição = " + description + " Valor = " + value;
    }

    @Override
    public int compareTo(Purchase otherPurchase) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(otherPurchase.value));
    }
}
