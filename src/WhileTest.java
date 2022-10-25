public class WhileTest {

    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            //contador = contador + 1;
            //contador += 1;
            contador++;
        }
        System.out.println(contador);
    }
}
