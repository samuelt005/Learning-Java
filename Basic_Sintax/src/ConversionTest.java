public class ConversionTest {
    public static void main(String[] args) {
        double salary = 1270.50;
        int value = (int) salary;
        System.out.println(value);

        long longNumber = 31241241212414L;
        System.out.println(longNumber);
        short shortNumber = 2132;
        System.out.println(shortNumber);
        byte bNumber = 127;
        System.out.println(bNumber);

        //0.30000000000000004
        double value1 = 0.2;
        double value2 = 0.1;
        double total = value1 + value2;
        System.out.println(total);

        float floatingPoint = 3.14f;
        System.out.println(floatingPoint);

    }
}
