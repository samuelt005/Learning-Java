public class ConditionTest2 {
    public static void main(String[] args) {
        System.out.println("condition test");
        int age = 18;
        int numberOfPeople = 3;
        boolean accompanied = numberOfPeople >= 2;

        // || = ou
        // && = e
        if (age >= 18 && accompanied) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Sorry, you can't enter!!");
        }
    }
}