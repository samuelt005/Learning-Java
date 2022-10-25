public class ScopeTest {
    public static void main(String[] args) {
        System.out.println("condition test");
        int age = 18;
        int numberOfPeople = 3;

        //boolean accompanied = numberOfPeople >= 2;
        boolean accompanied = false;
        if (numberOfPeople >= 2) {
            accompanied = true;
        }
        // || = ou
        // && = e
        if (age >= 18 && accompanied) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Sorry, you can't enter!!");
        }
    }
}
