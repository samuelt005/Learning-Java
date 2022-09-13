public class ConditionTest {
    public static void main(String[] args) {
        System.out.println("condition test");
        int age = 17;
        int numberOfPeople = 3;
        if (age >= 18) {
            System.out.println("You are older then 18!");
            System.out.println("Welcome!");
        } else {
            if (numberOfPeople >= 2) {
                System.out.println("You are not 18 yo, but you can enter" +
                        ", because are accompanied!");
            } else {
                System.out.println("Sorry, you are too young!");
            }
        }
    }
}
